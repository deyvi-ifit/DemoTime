package com.example.demotime

import com.example.demotime.data.LawnMower

object Helpers {

    const val NAME_ID = "name"

    fun getLawnMowers(): List<LawnMower> {
        return listOf(
            LawnMower(
                123,
                R.drawable.classic,
                "The Classic",
                "99.99"
            ),
            LawnMower(
                456,
                R.drawable.diesel,
                "The Diesel",
                "9999.99"
            ),
            LawnMower(
                789,
                R.drawable.speedster,
                "The Speedster (bike included)",
                "7999.99"
            )
        )
    }
}