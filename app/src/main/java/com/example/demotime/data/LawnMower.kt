package com.example.demotime.data

import androidx.annotation.DrawableRes

data class LawnMower(
    val itemID: Int,
    @DrawableRes val imageId: Int,
    val name: String,
    val price: String
)
