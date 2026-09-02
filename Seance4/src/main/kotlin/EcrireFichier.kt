package org.lugo

import java.io.File


fun main(args : Array<String>){
    var fichier1 : File = File("vide.txt")
    if(!fichier1.exists()){
        fichier1.createNewFile()
    }

    var fichier2 : File = File("../pasVide.txt")
    if(!fichier2.exists()){
        fichier2.createNewFile()
    }

    if (fichier2.exists()){
        fichier2.writeText("Mateo lugo")
    }
}