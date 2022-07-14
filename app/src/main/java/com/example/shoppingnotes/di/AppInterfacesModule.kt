package com.example.shoppingnotes.di

import com.example.shoppingnotes.domain.IShopItemsRepository
import com.example.shoppingnotes.domain.IShopItemsUseCase
import com.example.shoppingnotes.domain.ShopItemsUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppInterfacesModule {
    // region UseCases
    @Binds
    abstract fun bindShopItemsUseCase(impl: ShopItemsUseCase): IShopItemsUseCase

    //region Repositories
    @Binds
    abstract fun bindShopItemsRepository(impl: IShopItemsRepository)
}