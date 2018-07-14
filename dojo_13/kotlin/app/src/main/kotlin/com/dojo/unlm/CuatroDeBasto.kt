package com.dojo.unlm

class CuatroDeBasto : Carta {


    override fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return oponente
    }
}
