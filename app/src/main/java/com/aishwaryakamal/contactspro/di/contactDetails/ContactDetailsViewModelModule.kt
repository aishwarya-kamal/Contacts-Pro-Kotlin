package com.aishwaryakamal.contactspro.di.contactDetails

import androidx.lifecycle.ViewModel
import com.aishwaryakamal.contactspro.di.ViewModelKey
import com.aishwaryakamal.contactspro.ui.contactDetails.ContactDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ContactDetailsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(ContactDetailsViewModel::class)
    abstract fun bindContactDetailsViewModel(contactDetailsViewModel: ContactDetailsViewModel): ViewModel
}