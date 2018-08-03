package com.dojo.unlm

import com.dojo.unlm.cartas.AnchoDeBasto
import com.dojo.unlm.cartas.AnchoDeEspada
import com.dojo.unlm.cartas.CuatroDeBasto
import com.dojo.unlm.cartas.TresDeEspadas
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertTrue

class BajadaUnitTest : Spek({
    given("dos jugadores") {
        var jugador1 = Jugador()
        var jugador2 = Jugador()
        on("tiran 2 cartas") {
            var mano = jugador1.baja(AnchoDeEspada())
            mano = jugador2.baja(mano, CuatroDeBasto())

            it("empieza una bajada nueva") {
                jugador1.baja(mano, TresDeEspadas())
            }

            it("el jugador 2 puede jugar luego del 1") {
                mano = jugador2.baja(mano, AnchoDeBasto())
                assertTrue(true)
            }
        }
    }
})