package com.example.demotime.presentation.home

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.demotime.Helpers.NAME_ID
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    var name: String = ""; private set

    init {
        savedStateHandle.get<String>(NAME_ID)?.let {
            name = it
        }
    }

}