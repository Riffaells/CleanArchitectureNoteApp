package com.rugry.cleanarchitecturenoteapp.feature.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rugry.cleanarchitecturenoteapp.ui.theme.BabyBlue
import com.rugry.cleanarchitecturenoteapp.ui.theme.LightBlue
import com.rugry.cleanarchitecturenoteapp.ui.theme.LightGreen
import com.rugry.cleanarchitecturenoteapp.ui.theme.RedOrange
import com.rugry.cleanarchitecturenoteapp.ui.theme.RedPink
import com.rugry.cleanarchitecturenoteapp.ui.theme.Violet

/*
* класс данных
* */
@Entity
data class Note (
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
) {
    companion object {
        val noteColor = listOf(RedOrange, RedPink, BabyBlue, LightBlue, LightGreen, Violet)
    }
}

class InvalidNoteException(message: String): Exception(message)