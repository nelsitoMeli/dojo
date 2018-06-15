package com.dojo.unlm

class Y(private val primera : Condicion, private val segunda : Condicion) : Condicion {
    override fun aplica(aula: Aula): Aula {
        return segunda.aplica(primera.aplica(aula))
    }
}