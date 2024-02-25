package com.kareem.movies.di

import com.kareem.domain.repo.MealsRepo
import com.kareem.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(mealsRepo: MealsRepo): GetMeals{
        return GetMeals(mealsRepo)
    }
}