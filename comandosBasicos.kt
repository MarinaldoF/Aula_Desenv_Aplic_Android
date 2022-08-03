fun main() {
    
    \\Esta linha imprime o texto em apenas uma linha.
    println("Ola, Mundo!!!")

    \\Esta linha imprime o texto e no campo que colocado uma barra com n na frente e pulado uma linha.
    println("Este texto \"quebra\" em \nlinhas")

    \\Esta linha imprime o nome em apenas uma linha e no campo que e colocado uma barra com t dar um espaço.
    println("Nota:\t 10")
    
    \\ É declarado duas variáveis imutáveis, e logo em seguinda e declaro nomes que vai pertencer à essas variáveis.
    val (endereco, numero) = Pair("Paulista", 1162)
   \\imprime a variável endereco declarada no val

    println(endereco)
   \\imprime a variável numero declarada no val
    println(numero)
    
}

\\ Resultado do código depois de executado.

Ola, Mundo!!!
Este texto "quebra" em 
linhas
Nota:	 10
Paulista
1162