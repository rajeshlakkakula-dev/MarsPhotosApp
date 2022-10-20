package com.rajesh.marsphotosapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.rajesh.marsphotosapp.network.MarsApi
import kotlinx.coroutines.launch

//enum class MarsApiStatus{LOADING,ERROR,DONE}

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _status = MutableLiveData<String>()

    val status : LiveData<String> = _status

    private fun getMarsPhotos(){

        viewModelScope.launch {

            val listResult = MarsApi.retrofitService.getPhotos()
            _status.value = listResult
        }


    }
}