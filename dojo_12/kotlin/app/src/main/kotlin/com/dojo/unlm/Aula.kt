package com.dojo.unlm

open class Aula(private val nombre: String,
                private val capacidad: Int,
                private val m2: Int = 10,
                private val computadoras: Int = 0) {
    constructor() : this("", 0, 0)

    fun tieneCapacidad(alumnos: Int): Aula {
        if (capacidad > alumnos) return this

        return NoHayEspacio()
    }

    fun tieneEspacio(espacioNecesario: Int): Aula {
        if (m2 > espacioNecesario) return this

        return NoHayEspacio()
    }

    fun tieneComputadoras(computadorasNecesarias: Int): Aula {
        if (computadoras > computadorasNecesarias) return this

        return NoHayEspacio()
    }

    open fun printEtiqueta(): Etiqueta {
        return Etiqueta("Aula: Lab $nombre")
    }

    open fun challenge(aula: Aula): Aula {
        return this
    }

    fun imprimirParaNoVidentes(): Aula {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
