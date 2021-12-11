package com.example.fivecontactsvlvkotlinv2.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        //contatos
        value = ""
    }
    val text: LiveData<String> = _text
}