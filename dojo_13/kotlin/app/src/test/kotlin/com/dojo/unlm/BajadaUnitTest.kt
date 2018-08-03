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
            var bajada = jugador1.baja(AnchoDeEspada())
            bajada = jugador2.baja(bajada, CuatroDeBasto())

            it("empieza una bajada nueva") {
                var bajadaNueva = jugador1.baja(bajada, TresDeEspadas())
                bajadaNueva
            }

            it("el jugador 2 puede jugar luego del 1") {
                bajada = jugador2.baja(bajada, AnchoDeBasto())
                assertTrue(true)
            }
        }
    }
})