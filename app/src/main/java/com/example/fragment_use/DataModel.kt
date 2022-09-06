package com.example.fragment_use

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel : ViewModel(){
    val messageForActivity: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val mFF1: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val mFF2: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}