package com.dicoding.footballapp.di

import com.dicoding.footballapp.core.domain.FootballInteractor
import com.dicoding.footballapp.core.domain.FootballUseCase
import com.dicoding.footballapp.ui.clubs.ClubsViewModel
import com.dicoding.footballapp.ui.detail.DetailViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<FootballUseCase> { FootballInteractor(get()) }
}

val viewModelModule = module {
    viewModel { ClubsViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}