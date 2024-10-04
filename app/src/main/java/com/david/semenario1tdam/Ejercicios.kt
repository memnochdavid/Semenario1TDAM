package com.david.semenario1tdam


fun main(){
    println("Escribe el ejercicio que quieres corregir (-1 para terminar):")
    val input = readLine()
    var ejercicio = input!!.toInt()
    val lista=listOf(1,5,3,4,55,6,7,8,999999,10)//La vamos a reutilizar en los ejercicios
    //do{
        when(ejercicio){
            1->{
                /*Ejercicio 1. Crea una función que obtenga el número máximo de una
                lista de números*/
                println("La lista es: ${lista}")
                println("El numero maximo de la lista es: ${maxNumFromList(lista)}")
            }
            2->{
                /*Ejercicio 2. Crea una función que obtenga la sumatoria de
                todos los números de una lista de números*/
                println("La lista es: ${lista}")
                println(sumatoria(lista))
            }
            3->{
                /*Ejercicio 3. Crea una función que dada una distancia en millas calcule su
                correspondiente en kms*/
                println("Escribe la distancia en millas:")
                val teclado1 = readLine()
                var millas = teclado1!!.toFloat()
                println("La distancia en kilómetros es: ${millasToKm(millas)}")

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
            }
            7->{
                /*Ejercicio 7. Crea una función que pone en mayúscula la primera letra de cada
                palabra de un texto*/
                var texto="El veloz murcielago hindu comia feliz cardillo y kiwi."
                println("El texto es: ${texto}")
                println("El texto con la primera letra de cada palabra en mayúscula es: ${initCap(texto)}")


            }


            //cosas
            -1->{
                println("Fin del programa")
            }
            else->{
                println("Ejercicio no encontrado")
            }
        }
    //}while(ejercicio!=-1);
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
    /*
    var cont=0
    var cosa :MutableList<Char>
    for(i in texto){
        if(i==' ' && (cont+1)<texto.length){

        }
        cont++
        if(cont==texto.length){
            break
        }
    }
    return texto*/
    var letra='a'
    var diferencia='a'-'A'
    var devuelve=""
    var combi=" "
    for(i in 0..diferencia) {
        devuelve+=texto.replace(" $letra", " $letra")
        letra++
    }
    return devuelve
}
