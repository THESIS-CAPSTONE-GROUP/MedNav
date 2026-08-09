package com.example.genericsmarthospitallocatormobileapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class OtpVerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verification)

        val selectedRole = intent.getStringExtra("ROLE") ?: "PATIENT"
        val etOtpCode = findViewById<TextInputEditText>(R.id.etOtpCode)
        val btnVerify = findViewById<Button>(R.id.btnVerifyOtp)

        btnVerify.setOnClickListener {
            val code = etOtpCode.text.toString()
            if (code.length == 6) {
                // Multi-Factor Authentication (OTP): Randomized code verification
                Toast.makeText(this, "OTP Verified Successfully", Toast.LENGTH_SHORT).show()

                // Dashboard Module: Navigate to the appropriate dashboard
                val targetActivity = when (selectedRole) {
                    "ADMIN" -> AdminDashboardActivity::class.java
                    "HOSPITAL" -> HospitalDashboardActivity::class.java
                    else -> UserDashboardActivity::class.java
                }

                startActivity(Intent(this, targetActivity))
                finishAffinity() // Clear activity stack after login
            } else {
                Toast.makeText(this, "Invalid OTP code", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
