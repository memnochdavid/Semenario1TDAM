package com.david.semenario1tdam

import android.R.attr.text
import kotlin.math.pow


fun main(){
    println("SEMEN_ARIO 1 - TADAM")
    println("Escribe el ejercicio que quieres corregir (-1 para terminar):")
    val input = readLine()
    var ejercicio = input!!.toInt()
    while(ejercicio!=-1){
        when(ejercicio){
            1->{
                /*Ejercicio 1. Crea una función que obtenga el número máximo de una
                lista de números*/
                val lista=listOf(1,5,3,4,55,6,7,8,999999,10)
                println("La lista es: ${lista}")
                println("El numero maximo de la lista es: ${maxNumFromList(lista)}")
                break
            }
            2->{
                /*Ejercicio 2. Crea una función que obtenga la sumatoria de
                todos los números de una lista de números*/
                val lista=listOf(1,5,3,4,55,6,7,8,999999,10)
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
                println("Escribe el primer número:")
                val teclado9 = readLine()
                var n1 = teclado9!!.toInt()
                println("Escribe el segundo número:")
                val teclado10 = readLine()
                var n2 = teclado10!!.toInt()
                if(primosRelativos(n1,n2)){
                    println("Los números $n1 y $n2 son primos relativos")
                }
                else{
                    println("Los números $n1 y $n2 no son primos relativos")
                }
                break
            }
            12-> {
                /*Ejercicio 12. Crea una función que determine si un número dado es capicúa*/
                println("Escribe un número:")
                val teclado11 = readLine()
                var num = teclado11!!.toInt()
                if (esCapicua(num)) {
                    println("El número $num es capicúa")
                } else {
                    println("El número $num no es capicúa")
                }
            }
            13->{
                /*Ejercicio 13. Crea una función que dada una cadena de texto con formato Emmet
                devuelva su correspondiente etiqueta HTML, teniendo en cuenta sólo los atributos
                de clase e id.*/
                println("Escribe una cadena de texto con formato Emmet:")
                val teclado12 = readLine()
                var cadena = teclado12!!
                println(emmetToHtml(cadena))


            }
            14->{
                /*Ejercicio 14. Crea una función que dado un número n imprima el siguiente ‘mosaico’
                (para n = 6):
                1
                22
                333
                4444
                55555
                666666*/
                println("Escribe un número:")
                val teclado13 = readLine()
                var num = teclado13!!.toInt()
                mosaico(num)
                break
            }
            15->{
                /*Ejercicio 15. Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
                que determine si los elementos, uno a uno, de ambos arrays son iguales */
                var lista1=listOf(1,2,9,4,5,6,7,8,9,10)
                var lista2=listOf(1,2,3,4,5,6,7,8,9,10)
                println("La lista 1 es: ${lista1}")
                println("La lista 2 es: ${lista2}")
                println("Resultado: ${arraysIguales(lista1,lista2)}")
                break
            }
            16->{
                /*Ejercicio 16: Crea una función que calcule el producto de todos los elementos en
                una lista de números.*/
                var listaNums=listOf(3,55,6,8,2,1,77)
                println("La lista es: ${listaNums}")
                println(productoNumsLista(listaNums))
                break
            }
            17->{
                /*Ejercicio 17: Crea una función que dada una lista de números, devuelva una nueva
                lista con solo los números pares.*/
                var listaNums=listOf(3,55,6,8,2,1,77)//la del ej anterior
                println("La lista es: ${listaNums}")
                println(numsPares(listaNums))
                break
            }
            18->{
                /*Ejercicio 18: Crea una función que determine si un número es primo.*/
                println("Escribe un número:")
                val teclado18 = readLine()
                var num = teclado18!!.toInt()
                if(esPrimo(num)) println("El número $num es primo.")
                else println("El número $num no es primo.")
                break
            }
            19->{
                /*Ejercicio 19: Crea una función que, dada una cadena de texto, elimine todas las
                vocales de la cadena.*/
                var cadena="Un zorro atrapado es mas peligroso que un chacal."
                println("Texto original: $cadena")
                println("Sin vocales: "+borraVocales(cadena))
                break
            }
            20->{
                /*Ejercicio 20: Crea una función que calcule el factorial de un número.*/
                println("Escribe un número:")
                val teclado20 = readLine()
                var num = teclado20!!.toInt()
                println("El número es: $num")
                println(factorialN(num))
            }
            21->{
                /*Ejercicio 21: Crea una función que invierta una cadena de texto. Por ejemplo, "hola" debería convertirse en
                "aloh".*/
                var cadena="Tengo un sueño: que un día esta nación se pondrá en pie y realizará el verdadero significado de su credo: Sostenemos que estas verdades son evidentes por sí mismas: que todos los hombres han sido creados iguales"
                println("Texto original:\n"+cadena)
                println(reves(cadena))
                break
            }
            22->{
                /*Ejercicio 22: Crea una función que, dado un número, devuelva True si es un número perfecto (la suma de
                sus divisores propios positivos es igual al número), o False en caso contrario.*/
                println("Escribe un número:")
                val teclado22 = readLine()
                var num = teclado22!!.toInt()
                if(esPerfecto(num)) println("El número $num es perfecto.")
                else println("El número $num no es perfecto.")
                break
            }
            23->{
                /*Ejercicio 23: Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un
                número que es igual a la suma de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un
                número Armstrong porque 1^3 + 5^3 + 3^3 = 153.*/
                println("Escribe un número: ")
                val teclado23 = readLine()
                var num = teclado23!!.toInt()
                if(wonderfulWorld(num)) println("El número $num es un numero Amstrong.")
                else println("El número $num no es un numero Amstrong.")
                break
            }
            24->{
                /*Ejercicio 24: Crea una función que encuentre el número más grande en una matriz bidimensional
                (una lista de listas).*/
                val matrix=arrayOf(intArrayOf(1,2,3,4,9999),intArrayOf(5,6,7,8,9),intArrayOf(10,11,12,13,14),intArrayOf(15,16,17,18,19))
                var mayor=buscaMayor(matrix)
                println("Mayor: $mayor")
                break
            }
            25->{
                /*Ejercicio 25: Crea una función que encuentre el número más pequeño en una matriz
                bidimensional (una lista de listas).*/
                val matrix=arrayOf(intArrayOf(1,2,3,4,9999),intArrayOf(5,6,7,8,9),intArrayOf(10,11,-12,13,14),intArrayOf(15,16,17,18,19))
                var menor=buscaMenor(matrix)
                println("Menor: $menor")
                break
            }
            26->{
                /*Ejercicio 26: Crea una función que, dada una lista de palabras, devuelva la
                palabra más larga.*/
                val palabras=listOf("pene", "supercalifragilisticoespialidoso", "libreta", "pantalla", "escritorio", "proyector")
                println("Lista de palabras:\n$palabras")
                var larga=masLarga(palabras)
                println("La mas larga es $larga")
                break
            }
            27->{
                /*Ejercicio 27: Crea una función que, dada una lista de palabras, devuelva la
                palabra más corta.*/
                val palabras=listOf("pene", "supercalifragilisticoespialidoso", "libreta", "pantalla", "escritorio", "proyector")
                println("Lista de palabras:\n$palabras")
                var corta=masCorta(palabras)
                println("La mas corta es $corta, (probablemente asiatico)")
                break
            }
            28->{
                /*Ejercicio 28: Crea una función que determine si una cadena de texto contiene solo
                caracteres alfabéticos (letras) y espacios en blanco.*/
                val texto="caca is poo"
                println("El texto es:\n$texto")
                if(soloLetrasEspacios(texto)) println("El texto solo contiene letras y espacios.")
                else println("El texto contiene numeros.")
                break
            }
            29->{
                /*Ejercicio 29: Crea una función que determine si una cadena de texto es un
                anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
                pero en un orden diferente.*/
                println("Escribe la palabra 1: ")
                val palabra1 = readLine()
                println("Escribe la palabra 2: ")
                val palabra2 = readLine()
                if(sonPalindromos(palabra1.toString(), palabra2.toString())) println("$palabra1 y $palabra2 son palindromos.")
                else println("$palabra1 y $palabra2 no son palindromos.")
                break
            }
            30->{
                /*Ejercicio 30: Crea una función que, dado un número entero, devuelva True si es un
                número triangular (puede representarse como un triángulo equilátero de puntos), o
                False en caso contrario.*/
                println("Escribe un número: ")
                val teclado30 = readLine()
                var num = teclado30!!.toInt()
                if(esTriangular(num)) println("El número $num es triangular.")
                else println("El número $num no es triangular.")
                break
            }
            //---------------------------------------------------------------------//
            //EXTRA
            31->{
                /*Ejercicio 31: Duplicar Elementos en una Lista
                Escribe una función que tome una lista de números y utilice la función map para
                duplicar cada número en la lista. La función debe devolver una nueva lista con
                todos los números duplicados.
                Por ejemplo, si la entrada es [1, 2, 3, 4], la función debe devolver [2, 4, 6, 8].*/
                var listaOriginal=listOf(1,2,3,4)
                println("Lista original: $listaOriginal")
                var listaDupli=duplicaLista(listaOriginal)
                println("Lista duplicada: $listaDupli")
                break
            }
            32->{
                /*Ejercicio 32: Crear un Diccionario a partir de Listas
                Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
                cree un diccionario utilizando mapOf para combinar las listas en un diccionario
                clave-valor. La función debe devolver el diccionario resultante.*/
                var claves=listOf(1,2,3,4,5,6,7)
                var valores=listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")
                var diccionario=creaMapa(claves,valores).toMap()
                println("Diccionario: $diccionario")
                break
            }
            33->{
                /*Ejercicio 33: Crea un programa se encargue de transformar un número decimal a
                binario sin utilizar funciones propias del lenguaje que lo hagan directamente.*/
                println("Escribe un número decimal:")
                val teclado33 = readLine()
                var num = teclado33!!.toInt()
                var binario=toBinario(num)
                println("El número $num en binario es: $binario")
                break
            }
            34->{
                /*Ejercicio 34: Crea una función que sea capaz de encriptar y desencriptar texto
                utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre
                él).*/
                println("Escribe un texto:")
                val teclado34 = readLine()
                var texto = teclado34!!
                println("Texto original: $texto")
                println("Texto encriptado: ${karakakas(texto,1)}")
                println("Texto desencriptado: ${karakakas(karakakas(texto,1),2)}")
                break
            }
            35->{
                /*Ejercicio 35: Crea una función que ordene y retorne una matriz de números.
                - La función recibirá un listado (por ejemplo [2, 4, 6, 8, 9]) y un parámetro adicional
                - "Asc" o "Desc" para indicar si debe ordenarse de menor a mayor o de mayor a
                menor.
                - No se pueden utilizar funciones propias del lenguaje que lo resuelvan
                automáticamente.*/
                var lista=mutableListOf(2, 4, 69, 8, 9, 6)
                println("Lista original: $lista")
                println("Lista ordenada de menor a mayor: ${ordenaLista(lista,"asc")}")
                println("Lista ordenada de mayor a menor: ${ordenaLista(lista,"desc")}")
                break





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
    imprime=imprime.dropLast(1)
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
//EJ11
fun primosRelativos(n1:Int,n2:Int):Boolean{
    var primo=true
    for(i in 2..n1){
        if(n1%i==0 && n2%i==0){
            primo=false
        }
    }
    return primo
}
//EJ12
fun esCapicua(num:Int):Boolean {
    var capicua = true
    var trampa = num.toString()
    var supertrampa = trampa.reversed()
    if (trampa != supertrampa) {
        capicua = false
    }
    return capicua
}
//EJ13
fun emmetToHtml(cadena:String):String{
    var trozos=cadena.split(".","#")
    var xml=""
    when(trozos.size){
        1->{
            xml="<${trozos[0]}></${trozos[0]}>"
        }
        2->{
            xml="<${trozos[0]} class=\"${trozos[1]}\"></${trozos[0]}>"
        }
        3->{
            xml="<${trozos[0]} class=\"${trozos[1]} id=\"${trozos[2]}\"></${trozos[0]}>"
        }
    }
    return xml
}
//EJ14
fun mosaico(num:Int){
    for(i in 1..num){
        for(j in 1..i){
            print("$i")
        }
        print("\n")
    }
}
//EJ15
fun arraysIguales(lista1:List<Int>,lista2:List<Int>):List<Boolean>{
    var listaBool=mutableListOf<Boolean>()
    for(i in 0..lista1.size-1){
        listaBool+=lista1[i]==lista2[i]
    }
    return listaBool
}
//EJ16
fun productoNumsLista(nums:List<Int>):String{
    var productos="Producto de los elementos: "
    var cal_culo=0
    for(i in 0..nums.size-1){
        if(i==0) cal_culo=nums[0]
        else cal_culo*=nums[i]
        productos+="${nums[i]} + "
    }
    productos=productos.dropLast(2)
    productos+="= "+cal_culo.toString()
    return productos
}
//EJ17
fun numsPares(nums:List<Int>):String{
    var pares="Los valores pares de la lista son: "
        pares+="${nums.filter{it%2==0}}"
    return pares
}
//EJ18
fun esPrimo(n:Int):Boolean{
    var loEs=true
    for(i in 2..n-1){
        if(n%i==0){
            loEs=false
        }
    }
    return loEs
}
//EJ19
fun borraVocales(cadena:String):String{
    var devuelve=""
    devuelve+=cadena.lowercase().filter{(it!='a' && it!='e'&& it!='i'&& it!='o'&& it!='u')}
    return devuelve
}
//EJ20
fun factorialN(n:Int):String{
    var devuelve="Factorial de n= "
    var resultado=1
    for(i in 1..n){
        resultado*=i
        devuelve+=(i.toString()+" * ")
    }
    devuelve=devuelve.dropLast(2)
    devuelve+=" = "+resultado
    return devuelve
}
//EJ21
fun reves(texto:String):String{
    var otxet="Texto al reves:\n"
    var i=texto.length-1
    while(i>0){
        otxet+=texto.get(i)
        i--
    }
    return otxet
}
//EJ22
fun esPerfecto(n:Int):Boolean{
    var suma=0
    for(i in 1..n/2){
        if(n%i==0){
            suma+=i
        }
    }
    if(n==suma) return true
    else return false
}
//EJ23
fun wonderfulWorld(n:Int):Boolean{
    var num=n
    var cifra=0
    var nCif=n.toString().length
    var suma:Double=0.0
    while(num>0){
        cifra=num%10
        num=num/10
        suma+=cifra.toDouble().pow(nCif)
    }
    if(suma==n.toDouble())return true
    else return false
}
//EJ24
fun buscaMayor(m:Array<IntArray>):Int{
    var mayor=m[0][0]
    for(i in 0..m.size-1){
        for(j in 0..m[i].size-1){
            if(mayor<m[i][j])
                mayor=m[i][j]
        }
    }
    return mayor
}
//EJ25
fun buscaMenor(m:Array<IntArray>):Int{
    var menor=m[0][0]
    for(i in 0..m.size-1){
        for(j in 0..m[i].size-1){
            if(menor>m[i][j])
                menor=m[i][j]
        }
    }
    return menor
}
//EJ26
fun masLarga(l:List<String>):String{
    var larga=l[0]
    for(i in 0..l.size-1){
        if(larga.length<l[i].length){
            larga=l[i]
        }
    }
    return larga
}
//EJ27
fun masCorta(l:List<String>):String{
    var corta=l[0]
    for(i in 0..l.size-1){
        if(corta.length>l[i].length){
            corta=l[i]
        }
    }
    return corta
}
//EJ28
fun soloLetrasEspacios(texto:String):Boolean{
    var devuelve=true
    //var topes= arrayOf('a'.code,'z'.code,'A'.code,'Z'.code)
    for(i in 0..texto.length-1){
        if(texto[i].isDigit()){
            devuelve = false
            break
        }
    }
    return devuelve
}
//EJ29
fun sonPalindromos(p1:String, p2:String):Boolean{
    var letras1=mutableListOf<Char>()
    var letras2=mutableListOf<Char>()
    var orden1=""
    var orden2=""
    if(p1.length!=p2.length){
        return false
    }else {
        for (i in p1) letras1.add(i)
        for (i in p2) letras2.add(i)
        letras1.sort()
        letras2.sort()
        for(i in letras1) orden1+=i
        for(i in letras2) orden2+=i
        if(orden1!=orden2) return false
        else return true
    }
}
//EJ30
fun esTriangular(n:Int):Boolean{
    var suma=0
    var i=1
    var imprime=""
    var devuelve=false
    var tope=0
    if (n<0) return devuelve
    while (suma<n) {
        suma+=i
        if (suma==n) {
            imprime="T<$i>="
            devuelve=true
            tope=i
        }
        i++
    }
    if (suma==n){
        for(i in 1..tope){
            imprime+="$i+"
        }
        imprime=imprime.dropLast(1)
        imprime+=" = $n"
        println(imprime)
    }
    return devuelve
}

//---------------------------------------------------------------------//
//EXTRA
//EJ31
fun duplicaLista(l:List<Int>):List<Int>{
    return l.map{it*2}
}
//EJ32
fun creaMapa(l1:List<Int>, l2:List<String>):Map<Int,String>{
    var mapa= mutableMapOf<Int,String>()
    for(i in 0.. l1.size-1){
        mapa.put(l1[i],l2[i])
    }
    return mapa
}
//EJ33
fun toBinario(n:Int):String{
    var devuelve=""
    var valor=n
    var i=0
    while(valor>0){
        if(i%4==0) devuelve+=" "
        devuelve+=valor%2
        valor/=2
        i++
    }
    devuelve=devuelve.reversed()
    return devuelve
}
//EJ34
fun karakakas(texto:String, opc:Int):String{
    var karaka=""
    when(opc) {
        1-> {
            for (i in texto.reversed()) {
                if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                    when (i) {
                        'a' -> karaka += '0'
                        'e' -> karaka += '1'
                        'i' -> karaka += '2'
                        'o' -> karaka += '3'
                        'u' -> karaka += '4'
                    }
                } else karaka += i
            }
        }
        2->{
            for (i in texto.reversed()) {
                if (i == '0' || i == '1' || i == '2' || i == '3' || i == '4') {
                    when (i) {
                        '0' -> karaka += 'a'
                        '1' -> karaka += 'e'
                        '2' -> karaka += 'i'
                        '3' -> karaka += 'o'
                        '4' -> karaka += 'u'
                    }
                } else karaka += i
            }

        }
        else-> throw Exception("Opción no válida")

    }
    return karaka
}
//EJ35
fun ordenaLista(l:MutableList<Int>, opc:String):List<Int>{
    val tope=l.size
    when (opc){
        "asc" ->{
            for (i in 0 until tope-1) {
                for (j in 0 until tope-i-1) {
                    if (l[j]>l[j+1]) {
                        val aux=l[j]
                        l[j]=l[j+1]
                        l[j+1]=aux
                    }
                }
            }
        }
        "desc" ->{
            for (i in 0 until tope-1) {
                for (j in 0 until tope-i-1) {
                    if (l[j]<l[j+1]) {
                        val aux=l[j]
                        l[j]=l[j+1]
                        l[j+1]=aux
                    }
                }
            }
        }
    }
    return l
}