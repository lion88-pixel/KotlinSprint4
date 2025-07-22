package org.example.lesson_19

enum class FishType {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun main() {
    println("Добавьте в аквариум следующие виды рыб:")
    for (fish in FishType.values()) {
        println("- ${fish.name}")
    }
}