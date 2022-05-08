package com.example.hiltpractice

import javax.inject.Inject

class Car @Inject constructor(brand: Brand, engine: Engine) {
    fun information() {
        println("Car 정보 출력")
    }
}

class Engine @Inject constructor()
class Brand @Inject constructor()