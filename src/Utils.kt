import java.util.*

object Utils {

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val numberStringList = listOf("uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez")

    val mapInt = mapOf(1 to 2, 3 to 4, 5 to 6, 7 to 8, 9 to 10)

    val personList = listOf(Persona("Juan", 20), Persona("Manuel",30), Persona("Rocio", 40))

}

data class Persona(var nombre: String? = null, var edad: Int? = null, var city: String? = null)