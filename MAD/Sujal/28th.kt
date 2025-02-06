package com.example.myapplication
fun main(){
    //Write a Kotlin program to print all prime numbers in between a given range, using UDF.
    println("Enter range for printing")
    var range= readLine()?.toInt()?:0
    var count=0
    if(range>=2){
        for (i in 2 .. range) {
            for (j in 1 .. i / 2) {
                if (i%j==0){
                    count++
                }
            }
            if (count==1 ){
                println("prime $i")
                count=0
            }else{
                count=0
            }
        }
    }else{
        println("Enter proper range greater than 1")
    }

}
