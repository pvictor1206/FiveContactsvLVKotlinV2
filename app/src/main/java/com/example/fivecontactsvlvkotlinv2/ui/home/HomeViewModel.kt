package com.example.fivecontactsvlvkotlinv2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        //Ligar
        value = "Ligar"
    }
    val text: LiveData<String> = _text
}