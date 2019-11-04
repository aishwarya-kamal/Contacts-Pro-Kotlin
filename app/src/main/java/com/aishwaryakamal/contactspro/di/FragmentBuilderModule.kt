package com.aishwaryakamal.contactspro.di

import com.aishwaryakamal.contactspro.di.addContact.AddContactViewModelModule
import com.aishwaryakamal.contactspro.di.contactDetails.ContactDetailsViewModelModule
import com.aishwaryakamal.contactspro.di.contactsList.ContactsListViewModelModule
import com.aishwaryakamal.contactspro.ui.addContact.AddContactFragment
import com.aishwaryakamal.contactspro.ui.contactDetails.ContactDetailsFragment
import com.aishwaryakamal.contactspro.ui.contactsList.ContactsListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {

    @ContributesAndroidInjector(modules = [ContactsListViewModelModule::class])
    abstract fun contributeContactsFragment() : ContactsListFragment

    @ContributesAndroidInjector(modules = [AddContactViewModelModule::class])
    abstract fun contributeAddContactFragment() : AddContactFragment

    @ContributesAndroidInjector(modules = [ContactDetailsViewModelModule::class])
    abstract fun contributeContactDetailsFragment() : ContactDetailsFragment
}