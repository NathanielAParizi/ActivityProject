package com.example.emicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class Rating : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        val button = findViewById<Button>(R.id.btn)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)



        button?.setOnClickListener {

        }

        fun onClick(view: View) {

        }
        button?.setOnClickListener {
            val message = ratingBar.rating.toString()

            Toast.makeText(
                this,
                "You have submitted a " + message + " Star Rating", Toast.LENGTH_LONG).show()
        }
    }
}
