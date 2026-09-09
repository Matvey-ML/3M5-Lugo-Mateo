import org.apache.commons.validator.routines.EmailValidator

fun main(){
    while (true){
        println("entrez une addresse courriel")
        val courriel = readln()
        val valid = EmailValidator.getInstance().isValid(courriel)
        if(valid){
            println("Cette addresse est valide!")
        }
        else{
            println("Cette addresse est invalide!")
        }

    }
}


