package com.fatalzero.currencyapptask.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.currencyapptask.R
import com.fatalzero.currencyapptask.data.network.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    @Inject
    lateinit var currencyiesApiService:ApiService

    private val component by lazy{
        (application as CurrencyApp).appComponent
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)



       CoroutineScope(Dispatchers.IO).launch {
           currencyiesApiService.getCurrencyList().forEach{
               Log.d("Activity",it.toString())
           }
       }


    }
}