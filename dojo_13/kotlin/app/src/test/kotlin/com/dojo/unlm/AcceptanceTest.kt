package com.dojo.unlm

import com.dojo.unlm.exception.NoEsTuTurnoException
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertTrue
import kotlin.test.fail

/**
 * Tests for the dojo.
 */
class AcceptanceTest : Spek({

    given("El jugador 1 tiene el ancho de espada, 3 de espada, 4 de copas y " +
            "El jugador 2 tiene el ancho de basto, 4 de basto y 7 de basto") {

        val jugador1 = Jugador().toma(TresDeEspadas(), AnchoDeEspada(), CuatroDeCopas())
        val jugador2 = Jugador().toma(AnchoDeBasto(), CuatroDeBasto(), SieteDeBasto())

        on("El jugador 1 juega el ancho de espada y El jugador 2 juega el 4 de basto") {

            var bajada = jugador1.baja(Bajada(), AnchoDeEspada())
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
    }

})