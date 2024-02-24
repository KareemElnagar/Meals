package com.kareem.domain.repo

import com.kareem.domain.entity.CategoryResponse

interface MealsRepo {
    fun getMealsFromRemote() : CategoryResponse

}