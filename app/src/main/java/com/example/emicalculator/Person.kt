package com.example.emicalculator

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    var name: String,
    var age: String,
    var job: String
) : Parcelable

