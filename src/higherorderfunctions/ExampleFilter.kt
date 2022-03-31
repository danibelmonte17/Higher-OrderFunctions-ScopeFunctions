package higherorderfunctions


fun exampleFilter() {
    println(Utils.numberList.filter { it > 5 })
    println(Utils.numberStringList.filterIndexed { index, s -> (index > 4) && (s.length < 5) })
}

//Genera un par de datos con dos arrays, uno con los coincidentes a la condicion y otro con el resto
fun examplePartition() {
    println(Utils.numberStringList.partition { it.length > 3 })
}

fun exampleTestPredicates() {
    println(Utils.numberStringList.any { it.startsWith("o") })
    println(Utils.numberStringList.none { it.startsWith("x") })
    println(Utils.numberStringList.all { it.startsWith("c") })
}
