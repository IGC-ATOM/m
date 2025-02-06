package com.example.myapplication

import kotlin.math.PI

fun main(){
    //Write a Kotlin program to calculate the area of a cylinder. Accept the radius and height from the user. Area: πr2h.
    println("Calculating  area of Cylinder :")
    println("Enter the radius :")
    var radius= readLine()?.toInt()?:0
    println("Enter the height :")
    var height= readLine()?.toInt()?:0

    println(" Area of Cylinder is :${PI*radius*2*height}")

}
