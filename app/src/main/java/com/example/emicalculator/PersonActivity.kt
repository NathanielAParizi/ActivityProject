package com.example.emicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_person.*

class PersonActivity : AppCompatActivity() {

    lateinit var passedIntent: Intent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        lateinit var passedIntent: Intent

    }

    fun onClick(view: View) {

        when (view.id) {
            R.id.btn -> {
                val mName = name.text.toString()
                val mAge = age.text.toString()
                val mJob = job.text.toString()
                val person = Person(mName, mAge, mJob)

                passedIntent.putExtra("PERSON", person)

                setResult(321, passedIntent)
                finish()

            }


        }
    }
}

