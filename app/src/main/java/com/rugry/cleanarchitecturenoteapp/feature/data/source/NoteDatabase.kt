package com.rugry.cleanarchitecturenoteapp.feature.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rugry.cleanarchitecturenoteapp.feature.domain.model.Note


@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "note_db"
    }
}