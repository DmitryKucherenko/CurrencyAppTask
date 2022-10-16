package com.fatalzero.currencyapptask.domain

import kotlinx.coroutines.flow.Flow

interface CurrenciesRepository {
    fun getCurrenciesList(): Flow<CurrencyInfo>
}