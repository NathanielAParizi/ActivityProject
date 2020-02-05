package com.example.emicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calandar.*
import kotlinx.android.synthetic.main.activity_main.*

class Calandar : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calandar)


        val calendarView = findViewById<CalendarView>(R.id.calendarView)


    }

    fun onClick(view: View) {
        calendarView?.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val toastMessage =
                "Scheduled a date:" + "DAY: " + dayOfMonth + "  Month: " + (1 + month) + "   Year: " + year
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }
    }


}
