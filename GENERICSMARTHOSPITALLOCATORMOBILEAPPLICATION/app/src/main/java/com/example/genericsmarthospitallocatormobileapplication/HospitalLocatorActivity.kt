package com.example.genericsmarthospitallocatormobileapplication

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class HospitalLocatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_locator)

        val tvHospitalName = findViewById<TextView>(R.id.tvHospitalName)
        val tvTravelTime = findViewById<TextView>(R.id.tvTravelTime)
        val tvFirstAid = findViewById<TextView>(R.id.tvFirstAid)
        val btnNavigate = findViewById<Button>(R.id.btnNavigate)
        val btnCall = findViewById<Button>(R.id.btnCallHospital)

        // GPS with Google Map Integration Module: Location Identification (Mocked)
        detectLocation()

        // Intelligent Hospital Recommendation Module: Precision Matching (Mocked)
        tvHospitalName.text = "St. Luke's Medical Center"
        tvTravelTime.text = "Estimated Travel Time: 8 mins (Traffic: Light)"
        tvFirstAid.text = "Apply pressure to the wound using a clean cloth. Elevate the injured area above the heart if possible."

        btnNavigate.setOnClickListener {
            // Route Optimization: Open Google Maps for navigation
            val gmmIntentUri = Uri.parse("google.navigation:q=St.+Luke's+Medical+Center")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            } else {
                Toast.makeText(this, "Google Maps not installed", Toast.LENGTH_SHORT).show()
            }
        }

        btnCall.setOnClickListener {
            // Quick Call Button Module: Emergency Contact Support
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:09123456789")
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 1)
                return@setOnClickListener
            }
            startActivity(intent)
        }
    }

    private fun detectLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 2)
        } else {
            Toast.makeText(this, "Detecting current location...", Toast.LENGTH_SHORT).show()
        }
    }
}
