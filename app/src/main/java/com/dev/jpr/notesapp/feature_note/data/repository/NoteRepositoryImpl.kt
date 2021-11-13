package com.dev.jpr.notesapp.feature_note.data.repository

import com.dev.jpr.notesapp.feature_note.data.data_source.NoteDao
import com.dev.jpr.notesapp.feature_note.domain.model.Note
import com.dev.jpr.notesapp.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
): NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNodeByID(id: Int): Note? {
        return dao.getNodeByID(id)
    }

    override suspend fun insertNode(note: Note) {
        dao.insertNode(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}