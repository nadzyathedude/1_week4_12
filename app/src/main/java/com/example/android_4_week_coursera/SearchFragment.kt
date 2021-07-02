package com.example.android_4_week_coursera

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class SearchFragment : Fragment() {


    //val button : Button = findViewById(R.id.buttonSearch)

    val sharedPreferencesHelp : SharedPreferencesHelp?=null



    fun onClick(){

        button .setOnClickListener(View.OnClickListener {
            if (searchFor!= null && !TextUtils.isEmpty(searchFor.text.toString().trim())){
                val searchingSystem : String? = sharedPreferencesHelp.getSelectedSystem()
                var url : String =""
                if(searchingSystem.equals(SearchCompanies.BING)){
                    url = "https://www.bing.com/search?q="
                }
                else if (searchingSystem.equals(SearchCompanies.GOOGLE)){
                    url = "https://www.google.ru/search?q="
                }
                else if (searchingSystem.equals(SearchCompanies.YANDEX)){
                    url = "https://yandex.kz/search/?text="
                }

                if (!url.equals("")){
                    val startSearch : Intent = Intent(Intent.ACTION_VIEW, Uri.parse( url + searchFor.text.toString()))
                    startActivity(startSearch)
                }
            }
        })
    }


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        return inflater.inflate(R.layout.fragment_search, container, false)
    }






}