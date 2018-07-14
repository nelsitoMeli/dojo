package com.dojo.unlm

class AnchoDeEspada : Carta {


    override fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return quienJugoMiCarta
    }
}
