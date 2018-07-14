package com.dojo.unlm

import com.dojo.unlm.exception.NoEsTuTurnoException

class Bajada {
    var ganadorAnterior: Jugador = Nadie()
    var jugadorAnterior: Jugador = Nadie()
    var cartaAnterior: Carta = NingunaCarta()

    fun agregar(jugador: Jugador, cartaNueva: Carta) {
        /*
        si hay una carta jugada anteriormente,
            comparar cual mata y guardar el ganador
        si hay un ganador anterior,
            comparar si el jugador es el ganador anterior
         */

        /*if (ganadorAnterior == Nadie() || ganadorAnterior == jugador) {
            ganadorAnterior = cartaAnterior.contra(cartaNueva, jugadorAnterior, jugador)
            jugadorAnterior = jugador
            cartaAnterior = cartaNueva
        } else {
            throw NoEsTuTurnoException()
        }*/
        ganadorAnterior.puedeJugar(jugador)
        ganadorAnterior = cartaAnterior.contra(cartaNueva, jugadorAnterior, jugador)
        jugadorAnterior = jugador
        cartaAnterior = cartaNueva
    }

}
