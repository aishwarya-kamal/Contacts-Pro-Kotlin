package com.aishwaryakamal.contactspro.di.contactsList

import androidx.lifecycle.ViewModel
import com.aishwaryakamal.contactspro.di.ViewModelKey
import com.aishwaryakamal.contactspro.ui.contactsList.ContactsListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ContactsListViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ContactsListViewModel::class)
    abstract fun bindContactsListViewModel(contactsListViewModel: ContactsListViewModel): ViewModel

}