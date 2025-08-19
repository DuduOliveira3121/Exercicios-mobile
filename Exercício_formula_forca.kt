fun main (){
    println("Dê o valor da massa")
    val massa: Double = readln().toDouble()

    println("Dê o valor da aceleração")
    val aceleracao: Double = readln().toDouble()

    val forca: Double = massa * aceleracao

    print("Resposta: ${forca}")
}

// F = m*a