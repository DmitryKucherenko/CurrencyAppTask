package com.fatalzero.currencyapptask.presentation

import android.app.Application
import com.fatalzero.currencyapptask.di.ApplicationComponent
import com.fatalzero.currencyapptask.di.DaggerApplicationComponent

class CurrencyApp : Application() {
    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(applicationContext)
    }
}