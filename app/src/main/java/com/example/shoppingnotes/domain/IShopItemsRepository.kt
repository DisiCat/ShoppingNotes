package com.example.shoppingnotes.domain

interface IShopItemsRepository {
    fun getItemsList(): List<ShopItem>
    fun getItemById(id: Int): ShopItem
    fun addItem(shopItem: ShopItem)
    fun deleteItemById(id: Int)
    fun editItem(shopItem: ShopItem)
}
