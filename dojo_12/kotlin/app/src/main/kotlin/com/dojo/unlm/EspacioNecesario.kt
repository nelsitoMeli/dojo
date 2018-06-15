package com.dojo.unlm

class EspacioNecesario(private val m2: Int) : Condicion {
    override fun aplica(aula: Aula):Aula {
        return aula.tieneEspacio(m2)
    }
}