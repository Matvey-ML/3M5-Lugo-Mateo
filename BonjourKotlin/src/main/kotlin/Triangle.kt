package org.lugo

fun main(){
    println("Entrez l'hauteur du triangle")
    val hauteur = readln().toInt()
    var largeur = 1

    for(i in 1..hauteur){
        for(i in 1..largeur){
            print("*")
        }
        println();
        largeur++
    }

}