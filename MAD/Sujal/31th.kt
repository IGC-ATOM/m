package com.example.myapplication

fun main(){
    //Write a Kotlin program to accept a value from the user either between 0-6 or any 1 value from the following: { “Sun”, “Mon”,”Tue”,”Wed”,”Thurs”,”Fri”,”Sat”}. Print the full name of the day based on input received using UDF
    println("Enter a value from Sun to Mon or 0 to 6 :")
    var day= readLine()
    var intday:Int=0
    if (day=="1"){
       intday=day?.toInt()?:0
    }
   if (day=="Sun"||intday==0){
       println("Sunday")
   }else if (day=="Mon"||intday==1){
       println("Monday")
   }else if (day=="Tue"||intday==2){
       println("Tuesday")
   }else if (day=="Wed"||intday==3){
       println("Wednesday")
   }else if (day=="Thurs"||intday==4){
       println("Thursday")
   }else if (day=="Fri"||intday==5){
       println("Friday")
   }else if (day=="Sat"||intday==6){
       println("Saturday")
   }else{
       println("Something Went wrong!!!")
   }
}