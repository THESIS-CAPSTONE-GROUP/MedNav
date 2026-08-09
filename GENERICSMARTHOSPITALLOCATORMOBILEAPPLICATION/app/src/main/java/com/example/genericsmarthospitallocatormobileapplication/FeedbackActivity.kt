package com.example.genericsmarthospitallocatormobileapplication

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class FeedbackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val etComment = findViewById<TextInputEditText>(R.id.etComment)
        val btnSubmit = findViewById<Button>(R.id.btnSubmitFeedback)

        btnSubmit.setOnClickListener {
            val rating = ratingBar.rating
            val comment = etComment.text.toString()

            if (rating > 0) {
                // Feedback Module: Logic to save feedback, ratings and comments
                Toast.makeText(this, "Thank you for your feedback! Rating: $rating stars", Toast.LENGTH_LONG).show()
                finish()
            } else {
                Toast.makeText(this, "Please provide a rating", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
