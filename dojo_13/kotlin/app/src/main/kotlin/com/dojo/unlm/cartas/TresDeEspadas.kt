package com.dojo.unlm.cartas

import com.dojo.unlm.Jugador

class TresDeEspadas : Carta {
    override fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return cartaOponente.contraTresDeEspada(quienJugoMiCarta, oponente)
    }
}
