package com.david.semenario1tdam


fun main(){
    println("Escribe el ejercicio que quieres corregir (-1 para terminar):")
    val input = readLine()
    var ejercicio = input!!.toInt()
    val lista=listOf(1,5,3,4,55,6,7,8,999999,10)//La vamos a reutilizar en los ejercicios
    while(ejercicio!=-1){
        when(ejercicio){
            1->{
                /*Ejercicio 1. Crea una función que obtenga el número máximo de una
                lista de números*/
                println("La lista es: ${lista}")
                println("El numero maximo de la lista es: ${maxNumFromList(lista)}")
                break
            }
            2->{
                /*Ejercicio 2. Crea una función que obtenga la sumatoria de
                todos los números de una lista de números*/
                println("La lista es: ${lista}")
                println(sumatoria(lista))
                break
            }
            3->{
                /*Ejercicio 3. Crea una función que dada una distancia en millas calcule su
                correspondiente en kms*/
                println("Escribe la distancia en millas:")
                val teclado1 = readLine()
                var millas = teclado1!!.toFloat()
                println("La distancia en kilómetros es: ${millasToKm(millas)}")
                break

            }
            4->{
                /*Ejercicio 4. Crea una función que determine si una cadena de texto es un
                palíndromo.*/
                println("Escribe la distancia en millas:")
                val teclado2 = readLine()
                var palabra = teclado2!!
                if(esPalindromo(palabra)){
                    println("La palabra ${palabra} es un palíndromo")
                }else{
                    println("La palabra ${palabra} no es un palíndromo")
                }
                break
            }
            5->{
                /*Ejercicio 5. Crea una función que cuenta cuántas veces aparece una letra en un
                texto.*/
                var letra:Char
                val texto="El veloz murcielago hindu comia feliz cardillo y kiwi."
                println("El texto es: ${texto}")
                println("Escribe la letra que quieres contar:")
                val teclado3 = readLine()
                letra=teclado3!![0]
                println("La letra ${letra} aparece ${cuentaLetraEnTexto(letra,texto)} veces en el texto")
                break
            }
            6->{
                /*Ejercicio 6. Crea una función que cuenta cuántas veces aparece una subcadena en
                un texto.*/
                var subcadena:String
                val texto="El veloz murcielago hindu comia feliz cardillo y kiwi."
                println("El texto es: ${texto}")
                println("Escribe la subcadena que quieres contar:")
                val teclado4 = readLine()
                subcadena=teclado4!!
                println("La subcadena ${subcadena} aparece ${cuentaSubcadenaEnTexto(subcadena,texto)} veces en el texto")
                break
            }
            7->{
                /*Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada
                palabra de un texto*/
                var texto="El veloz murcielago hindu comia feliz cardillo y kiwi."
                println("El texto es: ${texto}")
                println("El texto con la primera letra de cada palabra en mayúscula es: ${initCap(texto)}")
                break
            }
            8->{
                /*Ejercicio 8. Crea una función que sume los dígitos de un número. Ejemplo:
                sumaDigitos(245) = 2 + 4 + 5 = 11*/
                println("Escribe un número:")
                val teclado5 = readLine()
                var num = teclado5!!.toInt()
                println("La suma de los dígitos de ${num} es: ${sumaDigit(num)}")
                break
            }
            9->{
                /*Ejercicio 9. Crea una función que calcule el máximo común divisor de dos números
                naturales*/
                println("Escribe el primer número:")
                val teclado6 = readLine()
                var n1 = teclado6!!.toInt()
                println("Escribe el segundo número:")
                val teclado7 = readLine()
                var n2 = teclado7!!.toInt()
                println("El máximo común divisor de ${n1} y ${n2} es: ${mcd(n1,n2)}")
                break
            }
            10->{
                /*Ejercicio 10. Crea una función que calcule el término n-ésimo de la sucesión
                de Finbonacci. */
                println("Escribe el número de términos de la sucesión de Fibonacci que quieres calcular:")
                val teclado8 = readLine()
                var num = teclado8!!.toInt()
                println("Los ${num} primeros términos de la sucesión de Fibonacci son: ${fibonacci(num)}")
                break
            }
            11->{
                /*Ejercicio 11. Crea una función que determine si dos números son primos relativos*/





            }


            //cosas
            -1->{
                println("Fin del programa")
                break
            }
            else->{
                println("Ejercicio no encontrado")
                break
            }
        }
    }
}
//FUNCIONES

//EJ01
fun maxNumFromList(lista:List<Int>):Int{
    var max=0
    for(valor in lista){
        if(valor>max){
            max=valor
        }
    }
    return max
}
//EJ02
fun sumatoria(lista:List<Int>):String{
    var suma=0
    var imprime="Sumatoria = "
    for(valor in lista){
        imprime+="${valor}+"
        suma+=valor
    }
    imprime.dropLast(1)
    imprime+=" = ${suma}"
    return imprime.toString()
}
//EJ03
fun millasToKm(miles:Float):Double{
    return miles*1.60934
}
//EJ04
fun esPalindromo(palabra:String):Boolean{
    for(i in 0..palabra.length/2){
        if(palabra[i]!=palabra[palabra.length-1-i]){
            return false
        }
    };return true
}
//EJ05
fun cuentaLetraEnTexto(letra:Char,texto:String):Int {
    var cuenta = 0
    for (i in texto) {
        if (i == letra) {
            cuenta++
        }
    }
    return cuenta
}
//EJ06
fun cuentaSubcadenaEnTexto(subcadena:String,texto:String):Int {
    val temp: String = texto.lowercase().replace(subcadena.lowercase(), "")
    val veces: Int = (texto.length - temp.length) / subcadena.length
    return veces
}
//EJ07
fun initCap(texto:String):String{
    var palabras :List<String> = texto.split(" ")
    var devuelve=""
    for(i in 0..palabras.size-1){
        devuelve+=palabras[i].replaceFirstChar { it.uppercase() }+" "
    }
    return devuelve.dropLast(1)
}
//EJ08
fun sumaDigit(num:Int):String{
    var n=num
    var suma=0
    var imprime=""
    while(n>0){
        suma+=(n%10)
        imprime+="${n%10}+"
        n=n/10
    }
    imprime=imprime.drop(0)
    imprime=imprime.dropLast(1)
    imprime=imprime.reversed()
    imprime+=" = $suma"
    return imprime
}
//EJ09
fun mcd(n1:Int, n2:Int):Int{
    var mcd=1
    for(i in 1..n1){
        if(n1%i==0 && n2%i==0){
            mcd=i
        }
    }
    return mcd
}
//EJ10
fun fibonacci(num:Int):String{
    var imprime="0+"
    var lista=listOf(0,1)
    for(i in 2..num){
        lista+=lista[i-1]+lista[i-2]
        imprime+="${lista[i]}+"
    }
    return imprime.dropLast(1)
}


