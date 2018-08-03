package com.dojo.unlm.cartas

import com.dojo.unlm.Jugador
import com.dojo.unlm.Nadie

interface Carta {





    fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return Nadie()
    }
}