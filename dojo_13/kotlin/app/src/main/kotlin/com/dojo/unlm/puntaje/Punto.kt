package com.dojo.unlm.puntaje

import com.dojo.unlm.Jugador

class Punto(val jugador: Jugador, val puntoState: PuntoState) {
    constructor(jugador: Jugador) : this(jugador, SinPuntos())

    override fun equals(other: Any?): Boolean {
        if (other !is Punto) {
            return false
        }

        return other.jugador == this.jugador &&
                other.puntoState == this.puntoState
    }
}
