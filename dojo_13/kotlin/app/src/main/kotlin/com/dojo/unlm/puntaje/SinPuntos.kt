package com.dojo.unlm.puntaje

class SinPuntos : PuntoState {
    override fun equals(other: Any?): Boolean {
        if (other is SinPuntos) return true
        return false
    }
}