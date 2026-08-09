package com.example.genericsmarthospitallocatormobileapplication

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.google.android.material.card.MaterialCardView

class UserDashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_dashboard)

        val cardEmergency = findViewById<MaterialCardView>(R.id.cardEmergency)
        val cardRegular = findViewById<MaterialCardView>(R.id.cardRegular)

        cardEmergency.setOnClickListener {
            // Quick Call Button Module: Trigger emergency call
            makeEmergencyCall()
        }

        cardRegular.setOnClickListener {
            // Intelligent Hospital Recommendation Module: Start search/recommendation flow
            Toast.makeText(this, "Switching to Regular Mode", Toast.LENGTH_SHORT).show()
        }
    }

    private fun makeEmergencyCall() {
        val intent = Intent(Intent.ACTION_CALL)
        intent.data = Uri.parse("tel:911") // Default emergency number
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 1)
            return
        }
        startActivity(intent)
    }
}
