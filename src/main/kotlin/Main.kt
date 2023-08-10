package com.desafiolatam

fun main() {

    val products = populateData()

    products.forEach {
        println("+++++++++++++++++++++++++++++++++++++++++++++")
        val product = it.value
        println(
            "ID: ${product.id} " +
                    "\nNOMBRE: ${product?.name.uppercase()} " +
                    "\nDESCRIPCIÓN: ${product?.description.showNA(products?.description)} " +
                    "\nDISPONIBLE: ${product.isAvailable.YesOrNot(product?.isEnable)} " +
                    "\nHABILITADO  ${product} " +
                    "\nSTOCK: ${product}"
        )
        println("+++++++++++++++++++++++++++++++++++++++++++++")
    }
}

fun String.showNA(description:String): String = if(description==null) "N/A" else description

//fun Boolean.yesOrNot()

fun populateData(): MutableMap<Int, Product?> =
    mutableMapOf(
        1 to Product(
            id = 100,
            name = "Lapiz",
            description = null,
            isAvailable = true,
            isEnable = true,
            stock = 20
        ),
        2 to Product(
            id = 101,
            name = "Hoja de oficio",
            description = "Hojas para impresora",
            isAvailable = false,
            isEnable = true,
            stock = 150
        ),
        3 to Product(
            id = 102,
            name = "Hoja de carta",
            description = "Hojas para impresora",
            isAvailable = true,
            isEnable = true,
            stock = 100
        ),
        4 to Product(
            id = 103,
            name = "Corchetera",
            description = null,
            isAvailable = true,
            isEnable = false,
            stock = 150
        ),
        5 to Product(
            id = 104,
            name = "Tijeras",
            description = null,
            isAvailable = true,
            isEnable = true,
            stock = 100
        ),
        6 to Product(
            id = 105,
            name = "Sillas de oficina",
            description = null,
            isAvailable = false,
            isEnable = true,
            stock = 0
        ),
    )
