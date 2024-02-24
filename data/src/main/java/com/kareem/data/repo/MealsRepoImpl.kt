package com.kareem.data.repo

import com.kareem.data.remote.ApiService
import com.kareem.domain.entity.CategoryResponse
import com.kareem.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService):MealsRepo {
    override fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()

}