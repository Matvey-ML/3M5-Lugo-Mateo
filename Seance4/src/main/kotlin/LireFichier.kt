package org.lugo

import java.io.File
import java.io.FileNotFoundException

fun main(){
    println("Entrez des nom de fichiers separées par de virgules")
    println("Exemple: taxes.txt,nombres.txt,bananes.txt")

    val fichiers : List<String> = readln().split(",")
    fichiers.forEach {
        var fichierCourant = File(it)
        if(fichierCourant.exists()){
            println(fichierCourant.readText() + "\n------------------")
        }
        else{
            println("le fichier ${fichierCourant.toString()} n'existe pas! \n------------------")

        }
    }
}