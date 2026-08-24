```
fun main() {
    val monNombre = .1 + .1 + .1
    var maChaine = "Bonjour"
    maChaine += " le monde"
    println("monNombre = $monNombre")
    println("maChaine = $maChaine")
}
```

| Ligne exécutée                    | effet                                                                            | pile d'appels |
|-----------------------------------|----------------------------------------------------------------------------------|---------------|
| val monNombre = .1 + .1 + .1      | monNombre: .3                                                                    | main          |
| var maChaine = "Bonjour"          | monNombre: .3, maChaine: "Bonjour"                                               | main          |
| maChaine += " le monde"           | monNombre: .3, maChaine: "Bonjour", maChaine: "Bonjour le monde"                 | main          |
| println("monNombre = $monNombre") | monNombre: .3, maChaine: "Bonjour le monde", affiche "monNombre = .3"            | main          |
| println("maChaine = $maChaine")   | monNombre.3, maChaine: "Bonjour le monde", affiche "maChaine = Bonjour le monde" | main          |
                              

