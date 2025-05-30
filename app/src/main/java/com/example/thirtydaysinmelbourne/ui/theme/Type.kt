package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.thirtydaysinmelbourne.R

val lexenddeca = FontFamily(Font(R.font.lexenddeca_variablefont_wght))

val AppTypography = Typography  (
    headlineMedium = Typography().headlineMedium.copy(
        fontFamily = lexenddeca
    )
)
