package com.example.genericsmarthospitallocatormobileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class HospitalProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_profile)

        val etHospitalName = findViewById<TextInputEditText>(R.id.etProfileHospitalName)
        val etContact = findViewById<TextInputEditText>(R.id.etProfileHospitalContact)
        val etAddress = findViewById<TextInputEditText>(R.id.etProfileHospitalAddress)
        val btnUpload = findViewById<Button>(R.id.btnUploadPicture)
        val btnSave = findViewById<Button>(R.id.btnSaveHospitalProfile)

        btnUpload.setOnClickListener {
            // Logic to pick image from gallery
            Toast.makeText(this, "Opening Gallery...", Toast.LENGTH_SHORT).show()
        }

        btnSave.setOnClickListener {
            val name = etHospitalName.text.toString()
            if (name.isNotEmpty()) {
                // Hospital Profile Account Module: Update official digital presence
                Toast.makeText(this, "Hospital Profile Updated Successfully", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
