import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main(){
    val html = ("<html><head><title>First parse</title></head>"
            + "<body><p>Parsed HTML into a doc.</p></body></html>")
    val doc = Jsoup.parse(html)
}
