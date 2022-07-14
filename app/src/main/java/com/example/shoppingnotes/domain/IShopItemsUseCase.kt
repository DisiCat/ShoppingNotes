package com.example.shoppingnotes.domain

interface IShopItemsUseCase {
    fun getItemsList(): List<ShopItem>
    fun getItemById(id: Int): ShopItem
    fun addItem(name: String, count: Int)
    fun deleteItemById(id: Int)
    fun editItemById(name: String, count: Int, id: Int)
}
