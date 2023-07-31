package com.rugry.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.rugry.cleanarchitecturenoteapp.feature.data.source.NoteDatabase
import com.rugry.cleanarchitecturenoteapp.feature.data.repository.NoteRepositoryImpl
import com.rugry.cleanarchitecturenoteapp.feature.domain.repository.NoteRepository
import com.rugry.cleanarchitecturenoteapp.feature.domain.users.AddNote
import com.rugry.cleanarchitecturenoteapp.feature.domain.users.DeleteNote
import com.rugry.cleanarchitecturenoteapp.feature.domain.users.GetNote
import com.rugry.cleanarchitecturenoteapp.feature.domain.users.GetNotes
import com.rugry.cleanarchitecturenoteapp.feature.domain.users.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}