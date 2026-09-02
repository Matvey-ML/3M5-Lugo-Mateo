package org.lugo

fun main(){
    println("Entrez un string a éclater")
    var userString = readln()

    for (i in userString.indices){
        println(userString[i])
    }
}