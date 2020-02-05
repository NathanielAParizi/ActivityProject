package com.example.emicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_person.*

class PersonActivity : AppCompatActivity() {


    lateinit var passedIntent: Intent
    var people : ArrayList<Person> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        passedIntent = intent
    }

    fun onClick(view: View) {

        when (view.id) {
            R.id.btn -> {
                val mName = etName.text.toString()
                val mAge = etAge.text.toString()
                val mJob = etJob.text.toString()
                val person = Person(mName, mAge, mJob)
                people.add(person)


                passedIntent.putExtra("PERSON", person)
                setResult(321, passedIntent)
                finish()

            }


        }


    }

}

