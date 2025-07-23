package org.example.lesson_19

enum class FishType {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun main() {
    println("Добавь в аквариум следующие виды рыб:")
    FishType.values().forEach { fish ->
        println("- ${fish.name}")
    }
}