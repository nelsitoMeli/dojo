package com.dojo.unlm

import com.dojo.unlm.exception.NoEsTuTurnoException

open class Jugador {
    fun toma(carta1: Carta, carta2: Carta, carta3: Carta): Jugador {
        return this
    }


    fun baja(bajada: Bajada, carta: Carta): Bajada {
        bajada.agregar(this, carta)
        return bajada
    }

    open fun puedeJugar(jugador: Jugador) {
        if(jugador != this) {
            throw NoEsTuTurnoException()
        }
    }
}
