package com.aishwaryakamal.contactspro.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.aishwaryakamal.contactspro.data.Contact

@Dao
interface ContactDao {

    @Query("SELECT * FROM contact ORDER BY firstName ASC")
    fun getAllContacts(): LiveData<List<Contact>?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact?)

    @Update
    suspend fun updateContact(contact: Contact)

    @Query("SELECT * from contact WHERE firstName OR lastName LIKE '%' || :query || '%'")
    fun findContactByName(query: String): LiveData<List<Contact>>

    @Query("SELECT * FROM contact WHERE id = :contactId")
    fun getContactById(contactId: Int): LiveData<Contact?>
}