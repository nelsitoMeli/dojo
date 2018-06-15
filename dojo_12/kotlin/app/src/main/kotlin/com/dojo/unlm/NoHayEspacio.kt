package com.dojo.unlm

class NoHayEspacio : Aula(){
    override fun printEtiqueta(): Etiqueta {
        return Etiqueta("No hay aula disponible")
    }

    override fun challenge(aula: Aula) : Aula {
        return aula
    }
}