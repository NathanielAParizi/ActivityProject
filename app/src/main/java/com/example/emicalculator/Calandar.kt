package com.example.emicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calandar.*
import kotlinx.android.synthetic.main.activity_main.*

class Calandar : AppCompatActivity() {

    var toastMessage = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calandar)


        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        calendarView?.setOnDateChangeListener { view, year, month, dayOfMonth ->
            toastMessage =
                "Scheduled a date:" + "DAY: " + dayOfMonth + "  Month: " + (1 + month) + "   Year: " + year


        }


    }

    fun onClick(view: View) {
        Toast.makeText(this, toastMessage, Toast.LENGTH_LONG).show()

    }


}
