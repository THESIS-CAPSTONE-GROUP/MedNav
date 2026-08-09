package com.example.genericsmarthospitallocatormobileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class AdminDashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_dashboard)

        val btnVerify = findViewById<Button>(R.id.btnAuditLogs)
        val btnBroadcast = findViewById<Button>(R.id.btnBroadcast)
        val etAnnouncement = findViewById<TextInputEditText>(R.id.etAnnouncement)

        btnVerify.setOnClickListener {
            // Registration & Audit Trail logic
            Toast.makeText(this, "Opening Hospital Verification Audit Trail", Toast.LENGTH_SHORT).show()
        }

        btnBroadcast.setOnClickListener {
            val msg = etAnnouncement.text.toString()
            if (msg.isNotEmpty()) {
                // Broadcast Announcements tool
                Toast.makeText(this, "Alert Broadcasted to all users and hospitals", Toast.LENGTH_LONG).show()
                etAnnouncement.text?.clear()
            } else {
                Toast.makeText(this, "Please enter an announcement message", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
