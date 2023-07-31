package com.rugry.cleanarchitecturenoteapp.feature.domain.users

import com.rugry.cleanarchitecturenoteapp.feature.domain.model.InvalidNoteException
import com.rugry.cleanarchitecturenoteapp.feature.domain.model.Note
import com.rugry.cleanarchitecturenoteapp.feature.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()){
            throw InvalidNoteException("Название задачи пустое")
        }
        repository.insertNote(note)
    }
}