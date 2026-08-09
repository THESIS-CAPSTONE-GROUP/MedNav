package com.example.genericsmarthospitallocatormobileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RegisterHospitalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_hospital)

        val etHospitalName = findViewById<TextInputEditText>(R.id.etHospitalName)
        val etHospitalAddress = findViewById<TextInputEditText>(R.id.etHospitalAddress)
        val etHospitalContact = findViewById<TextInputEditText>(R.id.etHospitalContact)
        val etServices = findViewById<TextInputEditText>(R.id.etServices)
        val etEquipment = findViewById<TextInputEditText>(R.id.etEquipment)
        val etDoctors = findViewById<TextInputEditText>(R.id.etDoctors)
        val etPassword = findViewById<TextInputEditText>(R.id.etHospitalPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegisterHospital)

        btnRegister.setOnClickListener {
            val name = etHospitalName.text.toString()
            // Logic for hospital registration and credential submission
            if (name.isNotEmpty()) {
                Toast.makeText(this, "Hospital Registration Submitted for Verification", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Please fill in hospital name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
