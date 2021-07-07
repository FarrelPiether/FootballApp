package com.dicoding.footballapp.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.footballapp.core.domain.FootballUseCase

class FavoriteViewModel(footballUseCase: FootballUseCase) : ViewModel() {
    val club = footballUseCase.getFavoriteClub().asLiveData()
}