package com.example.myapplication

fun main(){
    //Write a Kotlin program to demonstrate the use of indices attributes and withIndex() function of an Array
    var arr= arrayOf("sujal","sanyam","ankit","parth","mahipal")
    for (index in arr.indices ){
      println("Array with index $index ${arr[index]} using indices")
    }
    println()
    for ((index,value )in arr.withIndex()){
        println("Array with index $index and values $value using withIndex()")
    }
}