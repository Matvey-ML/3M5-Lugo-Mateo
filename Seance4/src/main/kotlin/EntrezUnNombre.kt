package org.lugo

fun main(){
    println("Veuillez entrer un nombre:")
    while(true){
        try{
            var nombre : Int = readln().toInt()
            println("Merci, votre nombre est ${nombre}.")
            return
        }
        catch(e : Exception){
            println("Ceci n'est pas un nombre, veuillez entrer un nombre :")
        }

    }
}