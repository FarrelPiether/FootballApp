package com.dicoding.footballapp

import android.app.Application
import com.dicoding.footballapp.core.di.databaseModule
import com.dicoding.footballapp.core.di.networkModule
import com.dicoding.footballapp.core.di.repositoryModule
import com.dicoding.footballapp.di.useCaseModule
import com.dicoding.footballapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}