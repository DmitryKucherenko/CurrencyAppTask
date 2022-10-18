package com.fatalzero.currencyapptask.di


import android.content.Context
import com.fatalzero.currencyapptask.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component


@Component(modules = [DataModule::class])

interface ApplicationComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }

    fun inject(activity: MainActivity)
}