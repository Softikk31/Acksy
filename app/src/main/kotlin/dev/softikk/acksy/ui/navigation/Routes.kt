package dev.softikk.acksy.ui.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface NavBar

@Serializable
sealed class Routes {
    @Serializable
    object Welcome : Routes(), NavKey

    @Serializable
    object EnterEmail : Routes(), NavKey

    @Serializable
    object EnterVerifCode : Routes(), NavKey

    @Serializable
    object Home : Routes(), NavBar, NavKey

    @Serializable
    object CreateHabit : Routes(), NavBar, NavKey

    @Serializable
    object HabitDetails : Routes(), NavKey

    @Serializable
    object Statistics : Routes(), NavBar, NavKey

    @Serializable
    object Settings : Routes(), NavBar, NavKey

    @Serializable
    object SelectLanguage : Routes(), NavKey
}