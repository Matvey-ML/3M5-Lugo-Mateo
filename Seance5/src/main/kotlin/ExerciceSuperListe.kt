import org.magicwerk.brownies.collections.GapList
import java.util.LinkedList
import kotlin.random.Random
import kotlin.random.nextInt

fun main(){
    val arrayList = arrayListOf<Int>()
    val linkedList = LinkedList<Int>()
    val gaplist = GapList<Int>()

    println("ArrayList")
    testeCetteListe(arrayList)

    println("GapList")
    testeCetteListe(gaplist)

    println("LinkedList")
    testeCetteListe(linkedList)

}
fun testeCetteListe(liste: MutableList<Int>) {
    val random: Random = Random(1234)
    val a = System.currentTimeMillis()
    // ajouter 100 000 elements en dernière position liste.add(nombre);
    for(i in 1..100000){
        liste.add(i)
    }
    val b = System.currentTimeMillis()
    // ajouter 100 000 elements en première position liste.add(0, nombre);
    for(i in 1..100000){
        liste.add(0,i)
    }
    val c = System.currentTimeMillis()
    // ajouter 100 000 elements position au hasard liste.add(random.nextInt(liste.size + 1), nombre);
    for(i in 1..100000){
        liste.add(random.nextInt(liste.size + 1),i)
    }
    val d = System.currentTimeMillis()
    // afficher b-a, c-b, d-c qui sont les durées d'exécution en millisecondes
    println(b-a)
    println(c-b)
    println(d-c)
}