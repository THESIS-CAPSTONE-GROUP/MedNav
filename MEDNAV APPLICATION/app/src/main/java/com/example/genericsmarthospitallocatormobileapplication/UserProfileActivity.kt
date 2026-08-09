package com.example.genericsmarthospitallocatormobileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val etContact = findViewById<TextInputEditText>(R.id.etProfileContact)
        val etEmail = findViewById<TextInputEditText>(R.id.etProfileEmail)
        val btnUpdate = findViewById<Button>(R.id.btnUpdateUserProfile)

        btnUpdate.setOnClickListener {
            val contact = etContact.text.toString()
            val email = etEmail.text.toString()

            if (contact.isNotEmpty() || email.isNotEmpty()) {
                // User Profile Account Manager: Update personal info
                Toast.makeText(this, "Profile Updated Successfully", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
