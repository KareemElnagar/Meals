package com.kareem.domain.usecase

import com.kareem.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {
   suspend operator fun invoke() = mealsRepo.getMealsFromRemote()

}