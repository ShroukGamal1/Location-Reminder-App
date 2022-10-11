package com.udacity.project4.base

import androidx.navigation.NavDirections

sealed class NavigationCommand {
    object Back : NavigationCommand()

    data class To(val directions: NavDirections) : NavigationCommand()

    data class BackTo(val destinationId: Int) : NavigationCommand()
}