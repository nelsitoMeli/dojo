package com.dojo.unlm

open class Aula(private val nombre: String, private val capacidad: Int, private val m2: Int = 10) {
    constructor() : this("", 0, 0)

    open fun tieneCapacidad(alumnos: Int): Aula {
        if (capacidad > alumnos) return this

        return NoHayEspacio()
    }

    open fun tieneEspacio(espacioNecesario: Int): Aula {
        if (m2 > espacioNecesario) return this

        return NoHayEspacio()
    }

    open fun printEtiqueta(): Etiqueta {
        return Etiqueta("Aula: Lab $nombre")
    }

    open fun challenge(aula: Aula): Aula {
        return this
    }
}
