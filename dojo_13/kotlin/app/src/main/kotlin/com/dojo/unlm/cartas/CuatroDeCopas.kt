package com.dojo.unlm.cartas

import com.dojo.unlm.Jugador

class CuatroDeCopas : Carta {
    override fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return oponente
    }
}
