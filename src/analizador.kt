/* 
    Analizador lexico para el lenguaje PASCAL
 */

import java.util.*

class Analizador {
    internal var reservadas = arrayOf(
        arrayOf("begin"),
        arrayOf("if", "condicion", "then"),
        arrayOf("readln;"),
        arrayOf("writeln;"),
        arrayOf("else"),
        arrayOf("end.")
    )
    internal lateinit var reserve: Array<String>

    @Throws(InterruptedException::class)

    fun instrucciones() {
        println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
        print("Bienvenido al analizador Léxico Pascal!!                •\n")
        print("Por favor Introduce el codigo que desea analizar        •\n")
        println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••")
        println()
    }

    fun inicio() {
        try {
            var number = 0 //comenzamos a obtener las líneas de código
            var fails = 0  //fallas del usuario
            var i = 0
            while (i < reservadas.size) {
                number++
                print(number.toString() + " | > ")
                val input = Scanner(System.`in`)
                val line = input.nextLine()
                reserve = line.split(" ".toRegex()).dropLastWhile {
                    it.isEmpty()
                }
                    .toTypedArray() //dado el código ingresado por el usaurio, delimitamos los espacios /b para su validación
                if (reserve.size == reservadas[i].size) {
                    print("\n")
                } else {
                    println("Syntax Error in line $number                           ")
                    i = i - 1
                    fails++
                }
                i++
            }
            q3(fails)
        } catch (excepcion: ArrayIndexOutOfBoundsException) {
            println("ERROR FATAL, DEBE REINICIAR EL PROYECTO                           ")

        }


    }

    fun q3(fails: Int) { //Estado final
        if (fails > 1)
            println("LA EJECUCIÓN HA FINALIZADO CORRECTAMENTE, DESPUÉS DE $fails ERRORES DE SINTAXIS                              ")
        else
            println("LA EJECUCIÓN HA FINALIZADO CORRECTAMENTE " + "                             ")
    }

    fun q1(): String { //Siguiente estado, toma de cadenas por el usuario
        val input = Scanner(System.`in`)
        val line = input.nextLine()
        return line
    }

    fun qError(i: Int): Int { //estado final pero no aceptador, se envía de acuerdo a un error
        var i = i
        println("Syntax Error in line " + (i + 1) + "                           ")
        if (i > 0)
            i = i - 1
        else {
            i = i + 1
        }
        println(i)
        return i
    }

    companion object {

        @Throws(InterruptedException::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val aut = Analizador()
            //Analizador lexico pascal
            aut.instrucciones()
            val q0 = Analizador()
            q0.inicio()
        }
    }
}

