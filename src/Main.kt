import java.util.Scanner
import kotlin.random.Random

fun main() {

    /*var monedasDe20: Int = 0
    var monedasDe50: Int = 0
    var monedaDe100: Int = 0
    var monedaDe200: Int = 0
    var monedaDe500: Int = 0

    while (true){
        println("Menú Principal")
        println("1. Agregar una moneda")
        println("2. Cuantas monedas tiene")
        println("3. Total de dinero ahorrado")
        println("4. Romper la alcancía")
        println("5. Salir")

        val opcion = readLine()?.toIntOrNull()

            when (opcion) {
                    1 -> {
                        println("1. Moneda de 20")
                        println("2. Moneda de 50")
                        println("3. Moneda de 100")
                        println("4. Moneda de 200")
                        println("5. Moneda de 500")
                        println("6. Que moneda vas a agregar:")

                        val moneda = readLine()?.toIntOrNull()
                        if (moneda in 1..5){
                            println("Ingresa la cantidad de monedas:")
                            val cantidadMonedas = readLine()?.toIntOrNull() ?: 0
                            if (cantidadMonedas > 0){
                                when (moneda){
                                    1 -> monedasDe20 += cantidadMonedas
                                    2 -> monedasDe50 += cantidadMonedas
                                    3 -> monedaDe100 += cantidadMonedas
                                    4 -> monedaDe200 += cantidadMonedas
                                    5 -> monedaDe500 += cantidadMonedas
                                }
                                println("$cantidadMonedas monedas agregadas.")
                            } else {
                                println("Canntidad Invalida")
                            }
                        } else {
                            println("Opcion de moneda invalida")
                        }
                    }
                    2 -> {
                        println("Cantidad de monedas en la alcancia")
                        println("1. Monedas de 20: $monedasDe20")
                        println("2. Monedas de 50: $monedasDe50")
                        println("3. Monedas de 100: $monedaDe100")
                        println("4. Monedas de 200: $monedaDe200")
                        println("5. Monedas de 500: $monedaDe500")
                    }
                    3 -> {
                        val totalDeMonedas = (monedasDe20 * 20) + (monedasDe50 * 50) + (monedaDe100 * 100) + (monedaDe200 * 200) + (monedaDe500 * 500)
                        println("Total monedas ahorradas: $totalDeMonedas")
                    }
                    4 -> {
                        val vaciar = (monedasDe20 * 20) + (monedasDe50 * 50) + (monedaDe100 * 100) + (monedaDe200 * 200) + (monedaDe500 * 500)
                        println("Rompiendo alcancia")
                        monedasDe20 = 0
                        monedasDe50 = 0
                        monedaDe100 = 0
                        monedaDe200 = 0
                        monedaDe500 = 0
                        println("Alcancia Vaciada")
                    }
                    5 -> {
                        println("Saliendo...")
                        break
                    }
                    else -> println("Opcion invalida, intentar de nuevo")
                }


        }

    println("Batalla Pokémon")

    println("Ingrese el pokémon de ataque tipo: Agua, Fuego, Planta, Eléctrico:")
    val ataque = readln()

    println("Ingrese el pokémon de defensa tipo: Agua, Fuego, Planta, Eléctrico:")
    val defensa = readln()

    println("Ingrese nivel de ataque:")
    var atacante = readln().toInt()
    if (atacante < 1) atacante = 1
    if (atacante < 100) atacante = 100

    println("Ingrese nivel de defensa:")
    var defensor = readln().toInt()
    if (defensor < 1) defensor = 1
    if (defensor < 100) defensor = 100

    var efectividad = 1.0

    if ((ataque == "Agua" && defensa == "Fuego")||
         (ataque == "Fuego" && defensa == "Planta")||
         (ataque == "Planta" && defensa == "Agua")||
         (ataque == "Eléctrico" && defensa == "Agua")) {
          efectividad = 2.0
    } else if ((ataque == "Fuego" && defensa == "Agua")||
                (ataque == "Agua" && defensa == "Planta")||
                (ataque == "Planta" && defensa == "Fuego")||
                (ataque == "Eléctrico" && defensa == "Planta")){
            efectividad = 0.5
        }
        val daño = 50 * (atacante.toDouble() / defensor) * efectividad

        println("Daño causado el ataque es: ${"%.2f".format(daño)}")
*/

    val input = Scanner(System.`in`)
        var votosCandidato1 = 0
        var votosCandidato2 = 0
        var votosCandidato3 = 0
        var gastosCandidato1: Long = 0
        var gastosCandidato2: Long = 0
        var gastosCandidato3: Long = 0

        while (true){
            println("Votaciones Representante Municipio")
            println("1. Votar:")
            println("2. Costos de campaña:")
            println("3. Vaciar urnas:")
            println("4. Numero total de votos:")
            println("5. Porcentaje de votos obtenidos por candidato:")
            println("6. Costo promedio de campaña en las elecciones:")
            println("7. Elija su opcion:")

            when (input.nextInt()){
                1 -> {
                    println("Elija un candidato (1-3):")
                    val opcion = input.nextInt()

                    println("Selecciona medio de influencia (1, Internet, 2. Radio, 3. Television):")
                    val medio = input.nextInt()

                    val costo = when (medio){
                        1-> 700000
                        2-> 200000
                        3-> 600000
                        else -> {
                            println("Opcion no valida")
                            continue
                        }
                    }

                    when (opcion){
                        1-> {
                            votosCandidato1++
                            gastosCandidato1 += costo
                        }
                        2-> {
                            votosCandidato2++
                            gastosCandidato2 += costo
                        }
                        3->{
                            votosCandidato3++
                            gastosCandidato3 += costo
                        }
                        else -> println("Candidato no valido")
                    }

                }
                2-> {
                    println("Gastos de campaña por candidato:")
                    println("Candidato 1: \$${gastosCandidato1}")
                    println("Candidato 2: \$${gastosCandidato2}")
                    println("Candidato 3: \$${gastosCandidato3}")
                }
                3-> {
                    votosCandidato1 = 0
                    votosCandidato2 = 0
                    votosCandidato3 = 0
                    gastosCandidato1 = 0
                    gastosCandidato2 = 0
                    gastosCandidato3 = 0
                    println("Urna vacia")
                }
                4-> println("Total de votos: ${votosCandidato1 + votosCandidato2 + votosCandidato3}")
                5-> {
                    val total = (votosCandidato1 + votosCandidato2 + votosCandidato3).toDouble()
                    if (total > 0){
                        println("Candidato 1: ${"%2f".format((votosCandidato1 / total) * 100)}%")
                        println("Candidato 2: ${"%2f".format((votosCandidato2 / total) * 100)}%")
                        println("Candidato 3: ${"%2f".format((votosCandidato3 / total) * 100)}%")
                    }else println("No hay votos")
                }
                6-> {
                    val totalGastos = gastosCandidato1 + gastosCandidato2 + gastosCandidato3
                    val totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3
                    if (totalVotos > 0) println("Costo de campaña: \$${totalGastos / totalVotos}")
                    else println("No hay datos suficientes para calcular el costo")
                }
                7-> {
                    println("Saliendo del programa...")
                }

            }

        }
    }



