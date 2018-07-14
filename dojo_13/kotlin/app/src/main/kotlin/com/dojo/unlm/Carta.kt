package com.dojo.unlm

interface Carta {





    fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return Nadie()
    }
}