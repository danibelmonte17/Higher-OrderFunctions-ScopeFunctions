package higherorderfunctions

fun exampleAggregateOperations(){
    println(Utils.numberList.max())
    println(Utils.personList.minBy { it.edad?:0 })
}