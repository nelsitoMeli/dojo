package com.dojo.unlm

class Computadoras(private val computadorasNecesarias: Int) : Condicion {
    override fun aplica(aula: Aula): Aula {
        return aula.tieneComputadoras(computadorasNecesarias)
    }

}
