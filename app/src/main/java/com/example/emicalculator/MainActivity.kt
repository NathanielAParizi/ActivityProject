package com.example.emicalculator

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


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
                startActivity(intent)
            }


        }

    }

}
