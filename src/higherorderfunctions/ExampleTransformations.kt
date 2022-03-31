package higherorderfunctions


//itera uno por uno los elementos de una colecccion, este se pueden hacer modificaciones u operaciones que devuelven un nuevo array
//en el cual no se ve alterado el original
fun exampleMap() {
    println(Utils.numberStringList.map { it.toUpperCase() })
    println(Utils.numberStringList)
}

//constructor de mapas a partir de los elementos de la colección y ciertos valores asociados a ellos.
//Por ejemplo formar las coordenadas de un gráfico de puntos.
fun exampleAssociate() {
    println(Utils.numberStringList.associateWith { it.length })
    println(Utils.numberStringList.associateBy { it.first().toUpperCase() })
    println(
        Utils.numberStringList.associateBy(
            keySelector = { it.first().toUpperCase() },
            valueTransform = { it.length })
    )
}

fun exampleGrouping() {
    println(Utils.numberStringList.groupBy { it.first().toUpperCase() })
}

