package com.dojo.unlm.puntaje

class NoCantoNadie : PuntoState {

    override fun equals(other: Any?): Boolean {
        if (other is NoCantoNadie) return true
        return false
    }
}