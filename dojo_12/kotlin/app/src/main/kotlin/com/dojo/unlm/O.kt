package com.dojo.unlm

class O(private val primera: Condicion, private val segunda: Condicion) : Condicion {
    override fun aplica(aula: Aula): Aula {
        return primera.aplica(aula).challenge(segunda.aplica(aula))
    }
}
