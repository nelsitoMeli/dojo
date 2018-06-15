package com.dojo.unlm

class Solicitud(private var condicion : Condicion) {
    fun buscarAulaQueAplica(lista: List<Aula>): Aula {
        return lista.map {
            aula -> condicion.aplica(aula)
        }
        .reduce{ //Gracias Deivid
            acc, aula -> acc.challenge(aula)
        }
    }

    fun y(nuevaCondicion: Condicion): Solicitud {
        condicion = Y(condicion, nuevaCondicion)
        return this
    }
}
