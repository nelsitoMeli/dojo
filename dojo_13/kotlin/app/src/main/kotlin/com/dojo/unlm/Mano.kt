package com.dojo.unlm

import com.dojo.unlm.cartas.Carta
import com.dojo.unlm.puntaje.NoCantoNadie
import com.dojo.unlm.puntaje.Punto

class Mano(jugador: Jugador, carta: Carta) {
    var ganadorBajadaAnterior: Jugador = Nadie()
    var bajadas = ArrayList<Bajada>()
    init {
        bajadas.add(Bajada(jugador, carta))
    }

    var cartasEnMano: Int = 1
    fun agregar(jugador: Jugador, cartaNueva: Carta): Mano {
        /*
        si hay una carta jugada anteriormente,
            comparar cual mata y guardar el ganador
        si hay un ganador anterior,
            comparar si el jugador es el ganador anterior
         */

        ganadorBajadaAnterior.puedeJugar(jugador)
        if (cartasEnMano % 2 == 0) {
            bajadas.add(Bajada(jugador, cartaNueva))
        }
        cartasEnMano++
        ganadorBajadaAnterior = bajadas[(cartasEnMano - 1) / 2].agregar(jugador, cartaNueva)
        return this
    }

    fun puntos(): Punto {
        return Punto(ganadorBajadaAnterior, NoCantoNadie())
    }

    fun puntos(jugador: Jugador): Punto {
        return Punto(jugador)
    }

}
