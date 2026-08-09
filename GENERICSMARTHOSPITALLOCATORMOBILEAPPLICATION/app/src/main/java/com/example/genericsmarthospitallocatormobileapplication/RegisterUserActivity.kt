package com.example.genericsmarthospitallocatormobileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RegisterUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        val etFullName = findViewById<TextInputEditText>(R.id.etFullName)
        val etContactNumber = findViewById<TextInputEditText>(R.id.etContactNumber)
        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)
        val etEmergencyContact = findViewById<TextInputEditText>(R.id.etEmergencyContact)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegisterUser)

        btnRegister.setOnClickListener {
            val name = etFullName.text.toString()
            val email = etEmail.text.toString()
            // Logic for registration (e.g., Firebase Auth or API call)
            if (name.isNotEmpty() && email.isNotEmpty()) {
                Toast.makeText(this, "User Registration Successful", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
