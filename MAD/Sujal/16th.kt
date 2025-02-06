package com.example.myapplication

fun main(){
    //Write a Kotlin program to accept a string from the user and count the number of vowels in it and display it to the user.
    println("Coumting vowels in string")
    println("Enter a string :-")
    var str= readLine().toString()
    var lstr=str.toLowerCase()
    var count=0
    for (i in lstr)
        when(i){
            'a'->{
                println("a")
                count++
            }
            'e'->{
                println("e")
                count++
            }
            'i'->{
                println("i")
                count++
            }
            'o'->{
                println("o")
                count++
            }
            'u'->{
                println("u")
                count++
            }

        }
    println("There are $count vowels in string $str")
}