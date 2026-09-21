
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
class TestPariteTest{
    @Test
    fun nombrePairRetourneTrue(){
        val a = 2
        val resultatAttendu = true

        val resultat = parite(a)

        assertEquals(resultatAttendu,resultat  )
    }

    @Test
    fun nombrePairRetourneFalse(){
        val a = 3
        val resultatAttendu = false

        val resultat = parite(a)

        assertEquals(resultatAttendu,resultat  )
    }
    @Test
    fun nombrePairNegatifRetourneTrue(){
        val a = -2
        val resultatAttendu = true

        val resultat = parite(a)

        assertEquals(resultatAttendu,resultat  )
    }

    @Test
    fun nombreImpairNegatifRetourneFalse(){
        val a = -3
        val resultatAttendu = false

        val resultat = parite(a)

        assertEquals(resultatAttendu,resultat  )
    }

}