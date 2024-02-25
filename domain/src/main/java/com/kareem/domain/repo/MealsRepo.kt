package com.kareem.domain.repo

import com.kareem.domain.entity.CategoryResponse

interface MealsRepo {
     suspend fun getMealsFromRemote() : CategoryResponse

}