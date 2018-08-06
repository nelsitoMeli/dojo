package com.dojo.unlm.puntaje

import com.dojo.unlm.Jugador
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it
import org.junit.Test

import org.junit.Assert.*

class PuntoTest : Spek({
    it("equals") {
        val jugador = Jugador()
        val punto = Punto(jugador, NoCantoNadie())
        assertEquals(Punto(jugador, NoCantoNadie()), punto)
    }
})