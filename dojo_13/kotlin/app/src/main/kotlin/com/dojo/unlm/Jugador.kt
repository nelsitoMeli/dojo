package com.dojo.unlm

import com.dojo.unlm.cartas.Carta
import com.dojo.unlm.exception.NoEsTuTurnoException

open class Jugador {
    fun toma(carta1: Carta, carta2: Carta, carta3: Carta): Jugador {
        return this
    }

    fun baja(carta: Carta): Mano {
        //return Bajada().agregar(this, carta)
        return Mano(this, carta)
    }

    fun baja(mano: Mano, carta: Carta): Mano {
        mano.agregar(this, carta)
        return mano
    }

    open fun puedeJugar(jugador: Jugador) {
        if(jugador != this) {
            throw NoEsTuTurnoException()
        }
    }
}
