package org.lugo

fun main(){
    while (true){
        println("Entrez des hauteurs de pyramide séparées par des espaces")
        println("Exemple : 3 3 4 5 1 2 3")

        val hauteurs : String = readln()
        try {
            afficherPyramide(hauteurs)
        }
        catch (e: Exception ){
            println("Svp Entrez seulement des nombres")
        }

    }

}
fun afficherPyramide(hauteurs: String) {
    val listeHauteurs = hauteurs.split(' ')
    val sb = StringBuilder()

    for (e in listeHauteurs.indices) {
        for (i in 1..listeHauteurs[e].toInt()) {
            for (i in 1..i) {
                sb.append("*")
            }
            sb.append("\n")
        }
        sb.append("\n")
    }
    println(sb)
}