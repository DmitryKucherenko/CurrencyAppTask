package com.fatalzero.currencyapptask.domain

class GetCurrenciesListUseCase (private val repository: CurrenciesRepository) {
    operator fun invoke() = repository.getCurrenciesList()
}