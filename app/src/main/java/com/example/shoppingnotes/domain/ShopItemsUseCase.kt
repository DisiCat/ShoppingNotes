package com.example.shoppingnotes.domain

import javax.inject.Inject

class ShopItemsUseCase @Inject constructor(
    private val shopItemsRepository: IShopItemsRepository
) : IShopItemsUseCase {
    override fun getItemsList(): List<ShopItem> {
        return shopItemsRepository.getItemsList()
    }

    override fun getItemById(id: Int): ShopItem {
        return shopItemsRepository.getItemById(id)
    }

    override fun addItem(name: String, count: Int) {
        val shopListSize = shopItemsRepository.getItemsList().size + 1 ?: 0
        val shopItem = createShopItem(shopListSize, name, count)
        shopItemsRepository.addItem(shopItem)
    }

    override fun deleteItemById(id: Int) {
        shopItemsRepository.deleteItemById(id)
    }

    override fun editItemById(name: String, count: Int, id: Int) {
        val shopItem = createShopItem(id, name, count)
        shopItemsRepository.editItem(shopItem)
    }

    private fun createShopItem(id: Int, name: String, count: Int): ShopItem {
        return ShopItem(id, name, count)
    }
}