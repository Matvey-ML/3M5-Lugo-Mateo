````
fun main() {
    println(factorielle(2))
}
fun factorielle(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * factorielle(n - 1)
    }
}
````

| ligne exécutée                | effet                                 | pilde d'appels                                       |
|-------------------------------|---------------------------------------|------------------------------------------------------|
| println(factorielle(2))       | apelle factorielle avec n = 2         | main                                                 |
| if (n == 0)                   | n : 2, la conditon est fausse         | factorielle<br/>main                                 |
| return n * factorielle(n - 1) | n : 2, appelle factorielle avec n = 1 | factorielle<br/>main                                 |
| if (n == 0)                   | n : 1, la condition est fausse        | factorielle<br/>factorielle<br/>main                 |
| return n * factorielle(n - 1) | n : 1, appelle factorielle avec n = 0 | factorielle<br/>factorielle<br/>main                 |
| if (n == 0)                   | n : 0, la condition est vraie         | factorielle<br/>factorielle<br/>factorielle<br/>main |
| return 1                      | n : 0, retourne 1                     | factorielle<br/>factorielle<br/>factorielle<br/>main |
| return n * factorielle(n - 1) | n : 1, retourne 1                     | factorielle<br/>factorielle<br/>main                 |
| return n * factorielle(n - 1) | n : 2, retourne 2                     | factorielle<br/>main                                 |
| println(factorielle(2))       | affiche "2"                           | main                                                 |
