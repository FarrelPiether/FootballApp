package com.dicoding.footballapp.core.data.remote

import android.util.Log
import com.dicoding.footballapp.core.data.remote.network.ApiResponse
import com.dicoding.footballapp.core.data.remote.network.ApiService
import com.dicoding.footballapp.core.data.remote.response.ClubResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn


class RemoteDataSource(private val apiService: ApiService) {

    suspend fun getAllClub(): Flow<ApiResponse<List<ClubResponse>>> {
        return flow {
            try {
                val response = apiService.getClubList(listId)
                val dataArray = response.clubs
                if (dataArray.isNotEmpty()){
                    emit(ApiResponse.Success(response.clubs))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e : Exception){
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

    companion object {
        private const val listId = "4328"
    }
}