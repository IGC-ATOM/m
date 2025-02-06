package com.example.myapplication

fun main(){
    //Write a Kotlin program to accept enrollment number, student name and marks of 5 subjects, from the user. Calculate the Total and Percentage and display all the details of the student on the screen.
    println("Enrollment Number :")
    val erollno:Int= readLine()?.toInt()?:12
    println("Name :")
    val name:String= readLine().toString()
    println("Enter marks of the subject..")
    val python=IntArray(5)
    var Total:Int=0 
for (i in 0 until 5){
    python[i]= readLine()?.toInt()?:12
    Total=Total+python[i]
}

    var Percentage=Total*100/500
    println("Enrollment NO :$erollno")
    println("Name :$name")
    println("Total :$Total")
    println("Percentage :$Percentage")

}