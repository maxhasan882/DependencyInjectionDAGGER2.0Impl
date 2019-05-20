package com.hasan.colormyview

import dagger.Module
import dagger.Provides

@Module
open class InfoModule{
    @Provides @Choose("Love")
    fun infoProviderLove():Info{
        return Info("I Love Dagger")
    }

    @Provides @Choose("Kotlin")
    fun infoProviderKotlin():Info{
        return Info("I Love Hello")
    }
}