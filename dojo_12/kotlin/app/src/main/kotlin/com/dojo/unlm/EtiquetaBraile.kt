package com.dojo.unlm

class EtiquetaBraile(private val path: String) {
    override fun equals(other: Any?): Boolean {
        if (other is EtiquetaBraile) return other.path == path

        return false
    }
}