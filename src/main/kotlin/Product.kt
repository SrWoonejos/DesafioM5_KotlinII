package com.desafiolatam

    data class Product(
        val id: Int,
        var name: String,
        val description: String?,
        var isAvailable: Boolean = true,
        var isEnable: Boolean = true,
        var stock: Int = 0,
    )
