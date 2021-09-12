package com.ericthecoder.hiltpractice.repository

import com.ericthecoder.hiltpractice.entity.Dog

interface DogsRepository {
    fun getBreeds(): List<Dog>
}
