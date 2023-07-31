package com.rugry.cleanarchitecturenoteapp.feature.domain.users

import com.rugry.cleanarchitecturenoteapp.feature.domain.model.Note
import com.rugry.cleanarchitecturenoteapp.feature.domain.repository.NoteRepository
/*
* использование пользователем удаление
* */
class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}