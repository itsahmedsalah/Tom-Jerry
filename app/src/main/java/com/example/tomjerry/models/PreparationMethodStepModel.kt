package com.example.tomjerry.models

data class PreparationMethodStepModel(
    val id: Int,
    val description: String,
)

val stepsList = listOf(
    PreparationMethodStepModel(
        id = 1, description = "Put the pasta in a toaster."
    ),
    PreparationMethodStepModel(
        id = 2, description = "Pour battery juice over it."
    ),
    PreparationMethodStepModel(
        id = 3, description = "Wait for the spark to ignite."
    ),
    PreparationMethodStepModel(
        id = 4, description = "Serve with an insulating glove."
    ),
)
