package com.aishwaryakamal.contactspro.di

import android.content.Context
import com.aishwaryakamal.contactspro.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,
        AppModule::class,
        ViewModelFactoryModule::class,
        FragmentBuilderModule::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }

}