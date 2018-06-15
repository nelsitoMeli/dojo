package com.dojo.unlm

class AlumnosQueAsisten(private val alumnos: Int) : Condicion {
    override fun aplica(aula: Aula): Aula {
        return aula.tieneCapacidad(alumnos)
    }
}