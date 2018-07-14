package com.dojo.unlm

class Etiqueta(private val mensaje: String) {

    override fun equals(other: Any?): Boolean {
        if (other is Etiqueta) return other.mensaje == mensaje

        return false
    }

    override fun toString(): String {
        return "Braile"
    }

    fun toBraile(): EtiquetaBraile {
        return EtiquetaBraile("braile.png")
    }

}
