package com.rugry.cleanarchitecturenoteapp.feature.presentation.notes

import com.rugry.cleanarchitecturenoteapp.feature.domain.model.Note
import com.rugry.cleanarchitecturenoteapp.feature.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()

}