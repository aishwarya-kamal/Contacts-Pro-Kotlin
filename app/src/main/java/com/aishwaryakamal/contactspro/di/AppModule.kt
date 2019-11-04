package com.aishwaryakamal.contactspro.di

import android.content.Context
import androidx.room.Room
import com.aishwaryakamal.contactspro.data.Repository
import com.aishwaryakamal.contactspro.data.local.ContactDao
import com.aishwaryakamal.contactspro.data.local.ContactRoomDatabase
import com.aishwaryakamal.contactspro.util.DATABASE_NAME
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AppModule {

    @JvmStatic
    @Singleton
    @Provides
    fun provideContactDao(contactRoomDatabase: ContactRoomDatabase): ContactDao {
        return contactRoomDatabase.contactDao()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideContactDatabase(context: Context): ContactRoomDatabase {
        return Room.databaseBuilder(context, ContactRoomDatabase::class.java, DATABASE_NAME).build()
    }

    @JvmStatic
    @Singleton
    @Provides
    fun provideContactRepository(contactDao: ContactDao): Repository {
        return Repository(contactDao)
    }

}