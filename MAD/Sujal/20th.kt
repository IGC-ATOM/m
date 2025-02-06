package com.example.myapplication

fun main(){
    //Write a menu driven Kotlin program to provide a list of options to the user for finding Square, Cube and factorial of a number. Using when perform the appropriate operation as selected by the user.
    do {
    println("Enter ur choice :")
    println("1) Square")
    println("2) Cube")
    println("3) Factorial")
    println("4) Exit")
    var choice= readLine()?.toInt()?:0



        when(choice){
            1->{
                println("Enter number :")
                var num= readLine()?.toInt()?:0
                println("Square is ${num * num}")

            }
            2->{
                println("Enter number :")
                var num= readLine()?.toInt()?:0
                println("Cube is ${num * num * num}")
            }
            3->{
                println("Enter number :")
                var num= readLine()?.toInt()?:0
                var fact:Int=1
                for (i in 1 .. num){
                    fact=fact * i
                }
                println("Factorial is :$fact")
            }


    }
    }while (choice<4)

}