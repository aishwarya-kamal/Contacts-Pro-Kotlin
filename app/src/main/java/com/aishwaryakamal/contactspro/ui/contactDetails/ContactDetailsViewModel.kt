package com.aishwaryakamal.contactspro.ui.contactDetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aishwaryakamal.contactspro.data.Contact
import com.aishwaryakamal.contactspro.data.Repository
import kotlinx.coroutines.launch
import javax.inject.Inject

class ContactDetailsViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    fun getContactByInt(contactId: Int) = repository.getContactById(contactId)

    private fun deleteRepositoryContact(contact: Contact?){
        viewModelScope.launch {
            repository.deleteContact(contact)
        }
    }

    fun deleteContact(contact: Contact?){
        deleteRepositoryContact(contact)
    }
}