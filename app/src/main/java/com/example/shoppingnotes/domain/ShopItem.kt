package com.example.shoppingnotes.domain

data class ShopItem(
    var idItem: Int,
    var nameItem: String,
    var countItems: Int,
    var isFavorites: Boolean = false
)
