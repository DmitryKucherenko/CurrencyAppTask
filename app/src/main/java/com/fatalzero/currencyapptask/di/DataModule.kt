package com.fatalzero.currencyapptask.di

import com.fatalzero.currencyapptask.data.network.ApiService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

@Module
class DataModule {

    private val BASE_URL =
        "https://us-central1-epam-laba-13-1527598553135.cloudfunctions.net/myWebsiteBackend/api/currency/"

    @Provides
    fun provideRetrofit(okhttp: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(okhttp)
            .build()
    }

    @Provides
    fun provideApi(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun provideOkHttpClient() = OkHttpClient.Builder().build()
}