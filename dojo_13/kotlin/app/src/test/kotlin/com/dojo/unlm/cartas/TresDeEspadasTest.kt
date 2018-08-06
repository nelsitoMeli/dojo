package com.dojo.unlm.cartas

import com.dojo.unlm.Jugador
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.*

class TresDeEspadasTest : Spek({
    given("un 3 de espada y un ancho de basto") {
        on("el 3 juega contra el ancho") {
            it("pierde el 3") {
                val jugador1 = Jugador()
                val jugador2 = Jugador()
                val ganador = TresDeEspadas().contra(AnchoDeBasto(), jugador1, jugador2)
                assertTrue(jugador2 == ganador)
            }
        }
    }
})