package com.aishwaryakamal.contactspro.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aishwaryakamal.contactspro.data.Contact

@Database(entities = arrayOf(Contact::class), version = 1, exportSchema = false)
abstract class ContactRoomDatabase : RoomDatabase(){

    abstract fun contactDao(): ContactDao
}