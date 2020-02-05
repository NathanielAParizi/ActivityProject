package com.example.emicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

class EMIActivity : AppCompatActivity() {

    lateinit var sbPricpal: SeekBar
    lateinit var sbRate: SeekBar
    lateinit var sbMonths: SeekBar

    var p = 0
    var n = 0
    var r =0
    var emi = 0.0



    lateinit var txtEmi: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emi)

        // [P x R x (1+R)^N]/[(1+R)^N-1],

        txtEmi = findViewById(R.id.textView)

        sbPricpal = findViewById(R.id.principle) as SeekBar
        sbRate = findViewById(R.id.rate) as SeekBar
        sbMonths = findViewById(R.id.months) as SeekBar

        sbPricpal.max = 100
        sbRate.max = 100
        sbMonths.max = 100



        sbPricpal.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                p = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })


        sbRate.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                r = progress

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        sbMonths.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                n = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })


    }

    fun onClick(view: View) {


        emi = ((p * r * Math.pow((1 + r).toDouble(), n.toDouble())) /
                (Math.pow((1 + r).toDouble(), n.toDouble())))

        Toast.makeText(applicationContext,p.toString(),LENGTH_LONG).show()
        txtEmi.text = r.toString()
    }

}
