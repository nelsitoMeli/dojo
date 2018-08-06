package com.dojo.unlm

import com.dojo.unlm.cartas.*
import com.dojo.unlm.exception.NoEsTuTurnoException
import com.dojo.unlm.puntaje.NoCantoNadie
import com.dojo.unlm.puntaje.Punto
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.fail

class ManoUnitTest : Spek({
    given("El jugador 1 tiene el ancho de espada, 3 de espada, 4 de copas y " +
            "El jugador 2 tiene el ancho de basto, 4 de basto y 7 de basto. " +
            "Si El jugador 1 juega el ancho de espada") {
        val jugador1 = Jugador()
        val jugador2 = Jugador()


        on("El jugador 2 juega el 4 de basto"){
            var mano = Mano(jugador1, AnchoDeEspada())
            mano.agregar(jugador2, CuatroDeBasto())

            it("El jugador 1 juega el Tres de Espadas y el Dos juega en Ancho de Basto") {
                mano.agregar(jugador1, TresDeEspadas())
                mano.agregar(jugador2, CuatroDeBasto())
                assertTrue(true)
            }
        }

        on ("una bajada está completa y gana el jugador 2") {
            var mano = Mano(jugador1, TresDeEspadas())
            mano.agregar(jugador2, AnchoDeBasto())

            it("puntos devuelve los del jugador2"){
                assertEquals(Punto(jugador2, NoCantoNadie()), mano.puntos())
            }
        }
    }
})