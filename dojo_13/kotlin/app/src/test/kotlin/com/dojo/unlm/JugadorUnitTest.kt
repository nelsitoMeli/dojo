package com.dojo.unlm

import com.dojo.unlm.exception.NoEsTuTurnoException
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class JugadorUnitTest : Spek({
    it("Mismo jugador da igual") {
        val jugador = Jugador()

        assertTrue(jugador == jugador)
    }

    it("Si es distinto jugador puedeJugar tira exception") {
        val jugador = Jugador()
        assertFailsWith<NoEsTuTurnoException> {
            jugador.puedeJugar(Jugador())
        }
    }
})