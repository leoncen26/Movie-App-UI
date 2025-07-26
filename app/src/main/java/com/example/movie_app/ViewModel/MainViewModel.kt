package com.example.movie_app.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.movie_app.Domain.FilmItemModel
import com.example.movie_app.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository = MainRepository()

    fun loadUpcoming(): LiveData<MutableList<FilmItemModel>>{
        return repository.loadUpcoming()
    }

    fun loadItem(): LiveData<MutableList<FilmItemModel>>{
        return repository.loadItems()
    }
}