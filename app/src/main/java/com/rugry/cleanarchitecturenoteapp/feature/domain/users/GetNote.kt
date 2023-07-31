package com.rugry.cleanarchitecturenoteapp.feature.domain.users

import com.rugry.cleanarchitecturenoteapp.feature.domain.model.Note
import com.rugry.cleanarchitecturenoteapp.feature.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}