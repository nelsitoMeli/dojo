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
                Aula("C", 15, 50)))


        on ("se solicita una para 10 personas") {

            val solicitud = Solicitud(AlumnosQueAsisten(10))

            it ("entrega una etiqueta con el nombre del aula") {
                val etiqueta = cau.buscar(solicitud)

                assertEquals("Aula: Lab B", etiqueta.toString())
            }
        }

        on ("se solicita una para 30 personas") {
            val solicitud = Solicitud(AlumnosQueAsisten(30))

            var etiqueta = cau.buscar(solicitud)

            assertEquals("No hay aula disponible", etiqueta.toString())
        }


        on ("se solicita una con espacio para maquetas") {
            val solicitud = Solicitud(AlumnosQueAsisten(10)).y(EspacioNecesario(30))

            var etiqueta = cau.buscar(solicitud)

            assertEquals("Aula: Lab C", etiqueta.toString())
        }
    }

})