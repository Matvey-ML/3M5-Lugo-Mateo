import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements
import java.io.IOException

fun main(){
    println("Entrez une url")
    while (true){
        val url = readln()
        try {
            fetchDocElements(url)
            break
        }
        catch (e : Exception){
            println("cette url n'est pas valide, svp entez une url valide")
        }
    }

}
fun fetchDocElements(url: String){
    val doc : Document = Jsoup.connect(url).get()
    val title : String = doc.title()

    val links : Elements = doc.getElementsByTag("a")
    links.forEach{
        println(it.attr("href"))
    }
}