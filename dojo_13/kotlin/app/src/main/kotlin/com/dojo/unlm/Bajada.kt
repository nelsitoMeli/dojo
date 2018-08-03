package com.dojo.unlm

import com.dojo.unlm.cartas.Carta

class Bajada(jugador: Jugador, carta: Carta) {
    var jugadorAnterior: Jugador = jugador
    var cartaAnterior: Carta = carta

    fun agregar(jugador: Jugador, cartaNueva: Carta): Jugador {
        var ganador = cartaAnterior.contra(cartaNueva, jugadorAnterior, jugador)
        jugadorAnterior = jugador
        cartaAnterior = cartaNueva
        return ganador
    }

}
