package com.dicoding.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Hero(
    val name: String,
    val description: String,
    val photo: Int,
    val nickname: String,
    val bounty: String
)  : Parcelable
