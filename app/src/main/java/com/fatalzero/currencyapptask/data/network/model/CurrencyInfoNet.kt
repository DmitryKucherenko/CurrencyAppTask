package com.fatalzero.currencyapptask.data.network.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrencyInfoNet(
    @Json(name = "date")
    val date: Int?,
    @Json(name = "rate")
    val rate: Double?,
    @Json(name = "base")
    val base: String?
)