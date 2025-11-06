package com.pucetec.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Example {
    val square: Square = Square().apply {
        sidesNumber = 4
        anotherThing = 6
    }
    val triangle: Triangle = Triangle().apply { sidesNumber = 3 }
    val inmutableVariable: Int = 0
    var variable: String = "algo"
    var booleanVariable: Boolean = false
    var floatVariable: Float = 0.0f
    var longVariable: Long = 0L

    @GetMapping ("/hello")
    fun hello(): String {
        return "hola mundo!"
    }
    @GetMapping("/square")
    fun square(): GeometricForm{
        return square
    }
}

open class GeometricForm{
    var sidesNumber: Int = 0
}

class Square: GeometricForm() {
    var anotherThing: Int = 2
}

class Triangle: GeometricForm() {

}