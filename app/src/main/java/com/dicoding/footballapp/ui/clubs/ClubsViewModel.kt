package com.dicoding.footballapp.ui.clubs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.footballapp.core.domain.FootballUseCase

class ClubsViewModel(footballUseCase: FootballUseCase) : ViewModel() {
    val club = footballUseCase.getAllClub().asLiveData()
}