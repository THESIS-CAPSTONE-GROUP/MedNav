package com.example.genericsmarthospitallocatormobileapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardPatient = findViewById<MaterialCardView>(R.id.cardPatient)
        val cardHospital = findViewById<MaterialCardView>(R.id.cardHospital)
        val cardAdmin = findViewById<MaterialCardView>(R.id.cardAdmin)

        cardPatient.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("ROLE", "PATIENT")
            startActivity(intent)
        }

        cardHospital.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("ROLE", "HOSPITAL")
            startActivity(intent)
        }

        cardAdmin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("ROLE", "ADMIN")
            startActivity(intent)
        }
    }
}
