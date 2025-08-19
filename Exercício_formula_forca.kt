fun main (){
    println("Dê o valor da massa") // Primeiro peço a massa
    val massa: Double = readln().toDouble() // Depois leio a resposta que o usuário digita

    println("Dê o valor da aceleração") // Depois peço a aceleração
    val aceleracao: Double = readln().toDouble() // Depois leio a resposta que o usuário digita

    val forca: Double = massa * aceleracao // Faz a conta em si

    print("Resposta: ${forca}") // Exibo o resultado
}

// F = m*a