package com.dojo.unlm

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

/**
 * Tests for the dojo.
 */
class DojoTest : Spek({

    given ("un conjunto de aulas") {
        val cau = CAU(listOf(
                Aula("A", 5),
                Aula("B", 15),
                Aula("C", 15, 50),
                Aula("D", 15, computadoras = 15)))


        on ("se solicita una para 10 personas") {

            val solicitud = Solicitud(AlumnosQueAsisten(10))

            it ("entrega una etiqueta con el nombre del aula") {
                val etiqueta = cau.buscar(solicitud)

                assertEquals(Etiqueta("Aula: Lab B"), etiqueta)
            }
        }

        on ("se solicita una para 30 personas") {
            val solicitud = Solicitud(AlumnosQueAsisten(30))

            var etiqueta = cau.buscar(solicitud)

            assertEquals(Etiqueta("No hay aula disponible"), etiqueta)
        }


        on ("se solicita una con espacio para maquetas") {
            val solicitud = Solicitud(AlumnosQueAsisten(10)).y(EspacioNecesario(30))

            var etiqueta = cau.buscar(solicitud)

            assertEquals(Etiqueta("Aula: Lab C"), etiqueta)
        }


        on ("se solicita una con computadoras") {
            val solicitud = Solicitud(AlumnosQueAsisten(10)).y(Computadoras(5))

            var etiqueta = cau.buscar(solicitud)

            assertEquals(Etiqueta("Aula: Lab D"), etiqueta)
        }


        on ("se solicita una con computadoras o 20m2") {
            val solicitud = Solicitud(Computadoras(5)).o(EspacioNecesario(20))

            var etiqueta = cau.buscar(solicitud)

            assertEquals(Etiqueta("Aula: Lab C"), etiqueta)
        }

        on ("se solicita para alumnos no videntes") {
            val solicitud = Solicitud(AlumnosQueAsisten(10))

            it ("la etiqueta se imprime en braile") {
                var etiqueta = cau.buscar(solicitud)

                assertEquals(Etiqueta("Aula: Lab B"), etiqueta)

                assertEquals(EtiquetaBraile("braile.png"), etiqueta.toBraile())
            }
        }
    }

})