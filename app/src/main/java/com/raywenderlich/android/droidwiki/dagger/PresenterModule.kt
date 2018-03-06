package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Raskae on 05/03/2018.
 */
@Module
class PresenterModule {
    @Provides
    @Singleton
    fun provideHomepagePresenter(homepage: Homepage): HomepagePresenter = HomepagePresenterImpl(homepage)

    @Provides
    @Singleton
    fun provideEntryPresenter(wiki: Wiki): EntryPresenter = EntryPresenterImpl(wiki)
}