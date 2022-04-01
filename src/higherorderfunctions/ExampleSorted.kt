package higherorderfunctions

import Utils

fun exampleSorted(){
    println(Utils.numberStringList.sorted())
    println(Utils.numberStringList.sortedDescending())
    println(Utils.numberStringList.sortedBy { it.length })
    println(Utils.numberStringList.sortedByDescending { it.length })
}