package com.dojo.unlm.cartas

import com.dojo.unlm.Jugador

class CuatroDeBasto : Carta {


    override fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return oponente
    }
}
