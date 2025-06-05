package com.example.tomjerry.models

import com.example.tomjerry.R

data class ItemContainerModel(
    val imageRes: Int,
    val itemTitle: String,
)

val settingItemsList = listOf(
    ItemContainerModel(
        imageRes = R.drawable.bed_single_02,
        itemTitle = "Change sleeping place",
    ),
    ItemContainerModel(
        imageRes = R.drawable.cat,
        itemTitle = "Meow settings",
    ),
    ItemContainerModel(
        imageRes = R.drawable.fridge,
        itemTitle = "Password to open the fridge",
    ),
)

val favoriteFoodItemsList = listOf(

    ItemContainerModel(
        imageRes = R.drawable.alert_01,
        itemTitle = "Mouses",
    ),
    ItemContainerModel(
        imageRes = R.drawable.hamburger_02,
        itemTitle = "Last stolen meal",
    ),
    ItemContainerModel(
        imageRes = R.drawable.sleeping,
        itemTitle = "Change sleep mood",
    ),
)