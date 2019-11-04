package com.aishwaryakamal.contactspro.data

import androidx.lifecycle.LiveData
import com.aishwaryakamal.contactspro.data.local.ContactDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(private val contactDao: ContactDao) {

    fun getAllContacts() : LiveData<List<Contact>?> = contactDao.getAllContacts()

    suspend fun insertContact(contact: Contact) = contactDao.insertContact(contact)

    suspend fun deleteContact(contact: Contact?) = contactDao.deleteContact(contact)

    suspend fun updateContact(contact: Contact) = contactDao.updateContact(contact)

    fun findContactByName(query: String): LiveData<List<Contact>> = contactDao.findContactByName(query)

    fun getContactById(id: Int): LiveData<Contact?> = contactDao.getContactById(id)
}
