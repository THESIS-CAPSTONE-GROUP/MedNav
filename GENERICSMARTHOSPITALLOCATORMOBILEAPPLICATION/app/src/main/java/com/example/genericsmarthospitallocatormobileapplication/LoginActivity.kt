package com.example.genericsmarthospitallocatormobileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val selectedRole = intent.getStringExtra("ROLE") ?: "PATIENT"

        val etEmail = findViewById<TextInputEditText>(R.id.etLoginEmail)
        val etPassword = findViewById<TextInputEditText>(R.id.etLoginPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)
        val tvRegisterLink = findViewById<TextView>(R.id.tvRegisterLink)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Multi-Factor Authentication (OTP): Step 1 - Send OTP to email/SMS (Mocked)
                Toast.makeText(this, "OTP sent to your registered contact", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, OtpVerificationActivity::class.java)
                intent.putExtra("ROLE", selectedRole)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please enter credentials", Toast.LENGTH_SHORT).show()
            }
        }

        tvForgotPassword.setOnClickListener {
            startActivity(Intent(this, ResetPasswordActivity::class.java))
        }

        tvRegisterLink.setOnClickListener {
            when (selectedRole) {
                "HOSPITAL" -> startActivity(Intent(this, RegisterHospitalActivity::class.java))
                else -> startActivity(Intent(this, RegisterUserActivity::class.java))
            }
        }
    }
}
