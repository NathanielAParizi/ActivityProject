package com.example.emicalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     val TAG_MAIN_ACTIVITY = "TAG_MAIN"  // Initialized at compile time
     val TAG_DISPLAY_ACITIVTY = "TAG_DISPLAY"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun onClick(view: View) {

        when (view.id) {

            R.id.takepicture -> {
                intent = Intent(this, PictureActivity::class.java)
                startActivity(intent)
            }
            R.id.emicalculator -> {
                intent = Intent(this, EMIActivity::class.java)
                startActivity(intent)
            }
            R.id.person -> {
                intent = Intent(this, PersonActivity::class.java)
                startActivityForResult(intent,123)
            }


        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        Log.v(TAG_DISPLAY_ACITIVTY,data?.getParcelableExtra<Person>("PERSON").toString())
        Toast.makeText(applicationContext,data?.getParcelableExtra<Person>("PERSON").toString(),LENGTH_LONG).show()

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

}
