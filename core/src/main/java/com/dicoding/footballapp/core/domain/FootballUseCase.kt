package com.dicoding.footballapp.core.domain

import com.dicoding.footballapp.core.data.Resource
import kotlinx.coroutines.flow.Flow

interface FootballUseCase {

    fun getAllClub(): Flow<Resource<List<Club>>>

    fun getFavoriteClub(): Flow<List<Club>>

    fun setFavoriteClub(club: Club, state: Boolean)
}