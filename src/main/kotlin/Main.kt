package examen1


// #####################################
// DEFINICIÓN DEL CUERPO DEL PROGRAMA
// #####################################

fun main() {
    // Declaración de variables
    var edad: Byte //aquí declaro la edad del alumno con byte porque son dos dígitos
    var mes: Byte //aquí declaro el mes del alumno con byte también son dos dígitos
    val jesus: String = "Jesús" //declaro la constante de mi nombre eb un String/val tabla11: String = "11x1=11\n 11x2=22\n..."

    //aqui declaro las constantes de las tablas de multiplicar
    val tabla11: String = "11x1=11\n 11x2=22"
    val tabla12: String = "12x1=12\n 12x2=22\n..."
    val tabla13: String = "13x1=13\n 13x2=26\n..."
    val tabla7: String = "7x1=7\n 7x2=14\n..."
    val tabla2: String = "2x1=2\n2x2=4\n2x3=6"
    val tabla4: String = "4x1=4\n4x2=8\n4x3=12"
    val tabla3: String = "3x1=3\n3x2=6\n3x3=9"
    val tabla5:String="5x1=5\n5x2=10\n5x3=15\n"
    val tabla6:String="6x1=6\n6x2x2=12\n6x3=18\n"
    val tabla8:String="8x1=8\n8x2=16\n8x3=24\n"
    val tabla9:String="9x1=9\n9x2=18\n9x3=27\n"
        // Aquí tienes que definir las variables que se utilizan


        // Leo desde teclado la edad del alumno y el mes actual
        var entrada: String
        var listaEntrada: List<String>
        println("Introduzca la configuración del programa en este formato: <edadDelAlumno>,  <mesActual>")
        entrada = readLine() ?: ""
        listaEntrada = entrada.split(",")

        // Linea Inicial de programa
        println("*".repeat(80))
        println("PROGRAMA DE GENERACIÓN DE TABLAS: $jesus")

        // Linea inicio cabecera
        println("_".repeat(80))

        if (listaEntrada.size != 2) //Compruebo el tamaño de la lista, si es != 2, finaliza el programa
        {
            println("La entrada no es correcta")
            println("_".repeat(80))
        } else { // Sino, leo edad y mes. Asigno -1 si hay error en la lectura.
            edad = try {
                listaEntrada[0].trim().toByte()
            } catch (_: Exception) {
                -1
            }
            mes = try {
                listaEntrada[1].trim().toByte()
            } catch (_: Exception) {
                -1
            }

            if ((edad <= 0) || (mes <= 0)) // Si alguno es menor que -1, finaliza el programa
            {
                println("La entrada no es correcta")
                println("_".repeat(80))
            } else //Sino, continuo
            {
                //TODO("Aquí el código de la cabecera")


                //Edad: 8. El alumno está dentro del rango [6-8]
                //Mes: 12. El mes es par, corresponden las tablas siguientes: {2,4}
                println("La edad es $edad y el mes es $mes")

                // Linea final cabecera
                println("_".repeat(80))

                //Imprime las las tablas en función de
                //TODO("Aquí las tablas")
    /*

                val tabla11=11
                for (i in 1..10) {
                    val product = tabla11 * i
                    println("$tabla11 * $i = $product")
                }
                val tabla12=12
                for (i in 1..10) {
                    val product = tabla12 * i
                    println("$tabla12 * $i = $product")
                }
                val tabla13=13
                for (i in 1..10) {
                    val product = tabla13 * i
                    println("$tabla13 * $i = $product")
                }

     */
                //aquí se especifica el rango de edad dependiendo que número se pulse al pedir edad
                when (edad) {
                    in 10..12 -> println("$tabla11 \n  $tabla12\n $tabla13")
                    in 8..10 -> println("$tabla7")
                    //  else(mes) {1,3,5,7,9,11
                    in 6..8 -> println("$tabla2 \n $tabla4")
                }

            }
            // Linea final de programa
            println("*".repeat(80))
        }
    }


