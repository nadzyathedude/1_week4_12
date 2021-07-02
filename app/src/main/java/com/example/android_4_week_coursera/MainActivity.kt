package com.example.android_4_week_coursera

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    override fun onBackPressed() {
        val fragmentManager: FragmentManager = supportFragmentManager
        if (fragmentManager.backStackEntryCount == 1) {
            finish()

        } else {
            fragmentManager.popBackStack()
        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater: MenuInflater = menuInflater;
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val fragmentManager = supportFragmentManager
        when (item.itemId) {
            R.id.exit -> {

                Toast.makeText(this, R.string.exit, Toast.LENGTH_SHORT).show()
                finish()
            }

            R.id.search -> {
                val searchFragment:SearchFragment = SearchFragment()
                fragmentManager.beginTransaction()
                    .replace(R.id.container, searchFragment)
                    .addToBackStack(searchFragment.javaClass.name)
                    .commit()
                Toast.makeText(this, R.string.search, Toast.LENGTH_SHORT).show()

            }
            R.id.settings -> {
                val settingsFragment: SettingsFragment = SettingsFragment()
                fragmentManager.beginTransaction()
                    .replace(R.id.container, settingsFragment)
                    .addToBackStack(settingsFragment.javaClass.name)
                    .commit()
                Toast.makeText(this, R.string.settings, Toast.LENGTH_SHORT).show()


            }
        }
        return super.onOptionsItemSelected(item)
    }


}