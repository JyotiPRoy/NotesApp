package com.dev.jpr.notesapp.feature_note.presentation.compose_notes

import androidx.compose.ui.focus.FocusState

sealed class ComposeEvent{
    data class EnteredTitle(val value: String): ComposeEvent()
    data class ChangeTitleFocus(val focusState: FocusState): ComposeEvent()
    data class EnteredContent(val value: String): ComposeEvent()
    data class ChangeContentFocus(val focusState: FocusState): ComposeEvent()
    data class ChangeColor(val color: Int): ComposeEvent()
    object SaveNote: ComposeEvent()
}
