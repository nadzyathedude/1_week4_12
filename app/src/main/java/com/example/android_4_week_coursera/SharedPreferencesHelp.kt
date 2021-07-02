package com.example.android_4_week_coursera

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesHelp {
    val SHARED_PREF_NAME = "SHARED_PREF_NAME"

    val SEARCH_KEY = "CHECKED_SEARCH_KEY"
    private var mSharedPreferences: SharedPreferences? = null

    fun SharedPreferencesHelper(context: Context) {

        mSharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }
    fun addChecked(checkedSystem: String?): Boolean {
        mSharedPreferences!!.edit().putString(SEARCH_KEY, checkedSystem).apply()
        return true
    }

    fun getSelectedSystem(): String? {
        return mSharedPreferences!!.getString(SEARCH_KEY, null)
    }


}