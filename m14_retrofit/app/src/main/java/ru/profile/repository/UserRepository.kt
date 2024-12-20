package ru.profile.repository

import ru.profile.api.RetrofitBuilder
import ru.profile.exception.ApiServiceException
import ru.profile.model.Results

private const val REQUEST_FAILED = "The request failed"

class UserRepository() {
    suspend fun getRandomUser(): Results? {
        val response = RetrofitBuilder.apiService.getRandomUser()
        if(!response.isSuccessful) throw ApiServiceException(REQUEST_FAILED)
        return  response.body()
    }
}