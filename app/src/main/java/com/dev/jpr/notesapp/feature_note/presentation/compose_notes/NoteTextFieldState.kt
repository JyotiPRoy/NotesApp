package com.dev.jpr.notesapp.feature_note.presentation.compose_notes

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
