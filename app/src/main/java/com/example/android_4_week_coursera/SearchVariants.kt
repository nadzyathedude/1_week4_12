package com.example.android_4_week_coursera

import java.util.*

object SearchCompanies {
    const val GOOGLE = "Google"
    const val YANDEX = "Яндекс"
    const val BING = "Bing"
    private val companies: List<String> = listOf(GOOGLE, YANDEX, BING)
    val defaultCompany: String
        get() = companies[0]
}