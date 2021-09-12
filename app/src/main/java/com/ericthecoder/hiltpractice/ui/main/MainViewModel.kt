package com.ericthecoder.hiltpractice.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ericthecoder.hiltpractice.entity.Dog
import com.ericthecoder.hiltpractice.repository.DogsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dogsRepository: DogsRepository
) : ViewModel() {

    private val dogBreedsEmitter = MutableLiveData<List<Dog>>()
    val dogBreeds: LiveData<List<Dog>> = dogBreedsEmitter

    init {
        loadDogBreeds()
    }

    private fun loadDogBreeds() {
        dogBreedsEmitter.value = dogsRepository.getBreeds()
    }
}
