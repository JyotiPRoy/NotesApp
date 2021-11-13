package com.dev.jpr.notesapp.feature_note.domain.use_case

import com.dev.jpr.notesapp.feature_note.domain.model.Note
import com.dev.jpr.notesapp.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return  repository.getNodeByID(id)
    }
}