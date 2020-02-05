package com.example.emicalculator

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    var mName: String,
    var mAge: String,
    var mJob: String
) : Parcelable

