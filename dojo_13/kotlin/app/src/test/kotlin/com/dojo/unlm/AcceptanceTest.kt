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

/**
 * Tests for the dojo.
 */
class AcceptanceTest : Spek({

    given("El jugador 1 tiene el ancho de espada, 3 de espada, 4 de copas y " +
            "El jugador 2 tiene el ancho de basto, 4 de basto y 7 de basto") {

        val jugador1 = Jugador()//.toma(TresDeEspadas(), AnchoDeEspada(), CuatroDeCopas())
        val jugador2 = Jugador()//.toma(AnchoDeBasto(), CuatroDeBasto(), SieteDeBasto())

        on("El jugador 1 juega el ancho de espada y El jugador 2 juega el 4 de basto") {

            var bajada = jugador1.baja(AnchoDeEspada())
            bajada = jugador2.baja(bajada, CuatroDeBasto())

            it("El jugador 1 puede jugar el tres de espada porque gano la bajada anterior ya que el ancho de espada mata todas las cartas"){
                jugador1.baja(bajada, TresDeEspadas())
                assertTrue(true)
            }

            it("El jugador 2 quiere jugar y no puede porque no ganó la bajada anterior") {
                try {
                    jugador2.baja(bajada, SieteDeBasto())
                    fail("El segundo jugador no puede jugar porque perdió")
                } catch (ex: NoEsTuTurnoException) {
                    assertTrue(true)
                }
            }

        }

        on("El jugador 1 juega el ancho de espada y El jugador 2 juega el 4 de basto," +
                "el 1 juega el tres de espada, el 2 el el ancho de basto, y por ultimo" +
                "el jugador 2 juega el 7 de basto y el 1 juega el 4 de copas") {

            var mano = jugador1.baja(AnchoDeEspada())
            mano = jugador2.baja(mano, CuatroDeBasto())
            mano = jugador1.baja(mano, TresDeEspadas())
            mano = jugador2.baja(mano, AnchoDeBasto())
            mano = jugador2.baja(mano, SieteDeBasto())
            mano = jugador1.baja(mano, CuatroDeCopas())

            it("el jugador 2 tiene 1 punto") {
                assertEquals(Punto(jugador2, NoCantoNadie()), mano.puntos())
            }

            it("el jugador 1 no tiene puntos") {
                assertEquals(Punto(jugador1), mano.puntos(jugador1))
            }
        }
    }

})