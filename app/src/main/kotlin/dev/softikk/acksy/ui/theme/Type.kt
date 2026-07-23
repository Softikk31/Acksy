package dev.softikk.acksy.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import dev.softikk.acksy.R

val inter = FontFamily(
    Font(R.font.inter, FontWeight.Normal), Font(R.font.inter, FontWeight.Medium)
)

val Typography = Typography(
    labelSmall = TextStyle(
        fontFamily = inter, fontWeight = FontWeight.Normal, fontSize = Dimens.labelSmallFontSize
    ), labelMedium = TextStyle(
        fontFamily = inter, fontWeight = FontWeight.Normal, fontSize = Dimens.labelMediumFontSize
    ), labelLarge = TextStyle(
        fontFamily = inter, fontWeight = FontWeight.Medium, fontSize = Dimens.labelLargeFontSize
    ), bodySmall = TextStyle(
        fontFamily = inter, fontWeight = FontWeight.Normal, fontSize = Dimens.bodySmallFontSize
    ), bodyMedium = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Normal,
        fontSize = Dimens.bodyMediumAndEmphasizedFontSize
    ), bodyLarge = TextStyle(
        fontFamily = inter,
        fontWeight = FontWeight.Medium,
        fontSize = Dimens.bodyMediumAndEmphasizedFontSize
    ), headlineMedium = TextStyle(
        fontFamily = inter, fontWeight = FontWeight.Normal, fontSize = Dimens.headlineMedium
    ), headlineLarge = TextStyle(
        fontFamily = inter, fontWeight = FontWeight.Medium, fontSize = Dimens.headlineLarge
    ), displaySmall = TextStyle(
        fontFamily = inter, fontWeight = FontWeight.Normal, fontSize = Dimens.displaySmall
    )
)