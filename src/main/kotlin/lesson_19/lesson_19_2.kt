package org.example.lesson_19

enum class ProductCategory {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getUserFriendlyName(): String =
        when (this) {
            CLOTHING -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            MISCELLANEOUS -> "Разное"
        }
}

class Product(val name: String, val id: Int, val category: ProductCategory) {
    fun displayProductInfo() {
        println("Название: $name, ID: $id, Категория: ${category.getUserFriendlyName()}")
    }
}

fun main() {
    val product1 = Product("Футболка", 123, ProductCategory.CLOTHING)
    val product2 = Product("Ручка", 456, ProductCategory.STATIONERY)
    val product3 = Product("Брелок", 789, ProductCategory.MISCELLANEOUS)

    product1.displayProductInfo()
    product2.displayProductInfo()
    product3.displayProductInfo()
}