package com.hasan.colormyview

import dagger.Component

@Component(modules = [InfoModule::class])
interface Component {
    fun inject(app:MainActivity)
}