package com.dojo.unlm

import com.dojo.unlm.cartas.*
import com.dojo.unlm.exception.NoEsTuTurnoException
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertTrue
import kotlin.test.fail

class ManoUnitTest : Spek({
    given("El jugador 1 tiene el ancho de espada, 3 de espada, 4 de copas y " +
            "El jugador 2 tiene el ancho de basto, 4 de basto y 7 de basto. " +
            "Si El jugador 1 juega el ancho de espada") {
        val jugador1 = Jugador()
        val jugador2 = Jugador()


        on("El jugador 2 juega el 4 de basto"){

            it("El jugador 1 puede jugar el tres de espada porque gano la bajada anterior ya que el ancho de espada mata todas las cartas"){
                var mano = jugador1.baja(AnchoDeEspada())
                mano = jugador2.baja(mano, CuatroDeBasto())
                jugador1.baja(mano, TresDeEspadas())
                assertTrue(true)
            }

            it("El jugador 2 quiere jugar y no puede porque no ganó la bajada anterior") {
                try {
                    var mano = jugador1.baja(AnchoDeEspada())
                    mano = jugador2.baja(mano, CuatroDeBasto())
                    jugador2.baja(mano, SieteDeBasto())
                    fail("El segundo jugador no puede jugar porque perdió")
                } catch (ex: NoEsTuTurnoException) {
                    assertTrue(true)
                }
            }

            it("El jugador 1 juega el Tres de Espadas y el Dos juega en Ancho de Basto") {
                var mano = jugador1.baja(AnchoDeEspada())
                mano = jugador2.baja(mano, CuatroDeBasto())
                mano = jugador1.baja(mano, TresDeEspadas())
                mano = jugador2.baja(mano, AnchoDeBasto())
                assertTrue(true)
            }
        }
    }
})