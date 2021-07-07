package com.dicoding.footballapp.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.footballapp.core.domain.Club
import com.dicoding.footballapp.core.domain.FootballUseCase

class DetailViewModel(private val footballUseCase: FootballUseCase) : ViewModel() {
    fun setFavoriteClub(club: Club, newStatus:Boolean) =
        footballUseCase.setFavoriteClub(club, newStatus)
}