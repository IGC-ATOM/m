package com.example.myapplication

fun main(){
    //Write a Kotlin program to make a simple calculator for +, - , *, /, %, using when.
    println("Simple Calculator!!!")
    println("Number1 :")
    var num1= readLine()?.toDouble()?:0.1
    println("Number2 :")
    var num2= readLine()?.toDouble()?:0.1

    println("Operator")
    var op= readLine()

    when(op){
        "-"->{
            println("${num1-num2}")
        }
        "+"->{
            println("${num1+num2}")
        }
        "/"->{
            println("${num1/num2}")
        }
        "*"->{
            println("${num1*num2}")
        }
        else->{
            println("Something went wrong")
        }
    }

}