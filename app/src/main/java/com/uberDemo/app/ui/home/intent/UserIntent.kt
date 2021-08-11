package com.uberDemo.app.ui.home.intent

sealed class UserIntent {
    object FetchUser : UserIntent()
}