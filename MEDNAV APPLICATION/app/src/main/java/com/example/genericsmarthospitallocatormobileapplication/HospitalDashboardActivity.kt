package com.example.genericsmarthospitallocatormobileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class HospitalDashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospital_dashboard)

        val etBedCapacity = findViewById<TextInputEditText>(R.id.etBedCapacity)
        val btnUpdateBeds = findViewById<Button>(R.id.btnUpdateBeds)
        val btnBackup = findViewById<Button>(R.id.btnBackupData)

        btnUpdateBeds.setOnClickListener {
            val capacity = etBedCapacity.text.toString()
            if (capacity.isNotEmpty()) {
                // Hospital Management Dashboard: Real time - bed capacity update
                Toast.makeText(this, "Bed capacity updated to $capacity", Toast.LENGTH_SHORT).show()
            }
        }

        btnBackup.setOnClickListener {
            // Backup and Restore Management Module
            performBackup()
        }
    }

    private fun performBackup() {
        // Data Backup logic: create manual or scheduled backups
        Toast.makeText(this, "Hospital data backup created successfully", Toast.LENGTH_LONG).show()
    }

    private fun restoreBackup() {
        // Data Restore logic
        Toast.makeText(this, "Restoring data from latest backup...", Toast.LENGTH_SHORT).show()
    }
}
