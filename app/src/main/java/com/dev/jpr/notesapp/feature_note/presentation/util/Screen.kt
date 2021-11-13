package com.dev.jpr.notesapp.feature_note.presentation.util

sealed class Screen(val route: String) {
    object NotesScreen: Screen("notes_screen")
    object ComposeScreen: Screen("compose_screen")
}
