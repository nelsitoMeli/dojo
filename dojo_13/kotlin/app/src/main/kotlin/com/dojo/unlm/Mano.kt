package com.dojo.unlm

import com.dojo.unlm.cartas.Carta
import com.dojo.unlm.puntaje.Punto

class Mano(jugador: Jugador, carta: Carta) {
    var ganadorAnterior: Jugador = Nadie()

    var bajada = Bajada(jugador, carta)

    fun agregar(jugador: Jugador, cartaNueva: Carta): Mano {
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
        ganadorAnterior = bajada.agregar(jugador, cartaNueva)

        return this
    }

    fun puntos(): Punto {
        return Punto(ganadorAnterior)
    }

    fun puntos(jugador: Jugador): Punto {
        return Punto(jugador)
    }

}
