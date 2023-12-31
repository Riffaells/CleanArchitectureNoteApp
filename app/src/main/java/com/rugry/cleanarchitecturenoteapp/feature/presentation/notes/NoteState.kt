package com.rugry.cleanarchitecturenoteapp.feature.presentation.notes

import com.rugry.cleanarchitecturenoteapp.feature.domain.model.Note
import com.rugry.cleanarchitecturenoteapp.feature.domain.util.NoteOrder
import com.rugry.cleanarchitecturenoteapp.feature.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)