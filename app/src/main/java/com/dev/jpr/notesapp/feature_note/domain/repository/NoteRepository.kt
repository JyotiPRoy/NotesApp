package com.dev.jpr.notesapp.feature_note.domain.repository

import com.dev.jpr.notesapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNodeByID(id: Int): Note?

    suspend fun insertNode(note: Note)

    suspend fun deleteNote(note: Note)
}