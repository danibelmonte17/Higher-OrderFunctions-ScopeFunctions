package scopefunctions

import Persona

fun exampleLet(){
    Utils.numberStringList.first { it.startsWith("o") }.let {
        println("Size: ${it.length}")
        println("Word: $it")
    }
    val word: String? = Utils.numberStringList.find { it.startsWith("u") }
    word?.let { println(it) }
}

fun exampleApply(){
    val person = Persona("Juan").apply {
        this.edad = 21
        this.city="Toledo"
    }
    println(person)
}

fun exampleWith(){
    with(Utils.numberList){
        println("First number ${first()}")
        println("Last number ${last()}")
    }
}

fun exampleRun(){
    Utils.personList.run {
        val sum = this.sumBy { it.edad?:0 }
        println("Arithmetic average: ${sum/this.size}")
    }
}