package com.rugry.cleanarchitecturenoteapp.feature.domain.repository

import com.rugry.cleanarchitecturenoteapp.feature.domain.model.Note
import kotlinx.coroutines.flow.Flow
/*
* Возможности заметок
* */
interface NoteRepository {
    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)
    suspend fun deleteNote(note: Note)
}