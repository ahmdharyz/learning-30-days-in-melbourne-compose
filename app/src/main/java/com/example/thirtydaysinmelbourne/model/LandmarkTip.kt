package com.example.thirtydaysinmelbourne.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LandmarkTip(
    val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val imageResourceId: Int,
)
