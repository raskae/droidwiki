package com.raywenderlich.android.droidwiki.dagger

import dagger.Component
import javax.inject.Singleton

/**
 * Created by Raskae on 03/03/2018.
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

}

