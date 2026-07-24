package dev.softikk.acksy.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    @Serializable
    object Welcome : Routes()

    @Serializable
    object EnterEmail : Routes()

    @Serializable
    object EnterVerifCode : Routes()

    @Serializable
    object Home : Routes()

    @Serializable
    object CreateHabit : Routes()

    @Serializable
    object HabitDetails : Routes()

    @Serializable
    object Statistics : Routes()

    @Serializable
    object Settings : Routes()

    @Serializable
    object SelectLanguage : Routes()
}