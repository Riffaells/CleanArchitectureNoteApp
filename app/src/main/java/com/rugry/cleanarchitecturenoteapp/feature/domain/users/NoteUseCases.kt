package com.rugry.cleanarchitecturenoteapp.feature.domain.users

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
