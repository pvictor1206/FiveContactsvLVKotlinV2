package com.example.fivecontactsvlvkotlinv2.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        //Perfil
        value = "Perfil"
    }
    val text: LiveData<String> = _text
}