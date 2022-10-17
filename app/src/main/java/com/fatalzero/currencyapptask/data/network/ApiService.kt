package com.fatalzero.currencyapptask.data.network

import com.fatalzero.currencyapptask.domain.CurrencyInfo
import retrofit2.http.GET

interface ApiService {

    @GET
    suspend fun getCurrencyList():List<CurrencyInfo>

}