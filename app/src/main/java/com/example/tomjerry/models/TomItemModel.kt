package com.example.tomjerry.models

import com.example.tomjerry.R

data class TomItemModel(
    val id: Int,
    val itemTitle: String,
    val description: String,
    val imageResId: Int,
    val costInCheeses: Int,
)
val tomItemModel = listOf(
    TomItemModel(
        id = 1,
        itemTitle = "Sport Tom",
        description = "He runs 1 meter... trips over his boot.",
        imageResId = R.drawable.sport_tom,
        costInCheeses = 3
    ),
    TomItemModel(
        id = 2,
        itemTitle = "Tom the lover",
        description = "He loves one-sidedly... and is beaten by the other side.",
        imageResId = R.drawable.tom_the_lover,
        costInCheeses = 5
    ),
    TomItemModel(
        id = 3,
        itemTitle = "Tom the bomb",
        description = "He blows himself up before Jerry can catch him.",
        imageResId = R.drawable.tom_the_bomb,
        costInCheeses = 10
    ),
    TomItemModel(
        id = 4,
        itemTitle = "Spy Tom",
        description = "Disguises itself as a table.",
        imageResId = R.drawable.spy_tom,
        costInCheeses = 12
    ),
    TomItemModel(
        id = 5,
        itemTitle = "Frozen Tom",
        description = "He was chasing Jerry, he froze after the first look",
        imageResId = R.drawable.forzen_tom,
        costInCheeses = 10
    ),
    TomItemModel(
        id = 6,
        itemTitle = "Sleeping Tom",
        description = "He doesn't chase anyone, he just snores in stereo.",
        imageResId = R.drawable.sleeping_tom,
        costInCheeses = 10
    ),
)