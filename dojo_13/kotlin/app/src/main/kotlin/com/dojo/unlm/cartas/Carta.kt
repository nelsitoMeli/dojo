package com.dojo.unlm.cartas

import com.dojo.unlm.Jugador
import com.dojo.unlm.Nadie

interface Carta {
    fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return Nadie()
    }

    fun contraAnchoDeBasto(quienJugoElAnchoDeBasto: Jugador, quienJugoLaOtraCarta: Jugador): Jugador {
        return quienJugoElAnchoDeBasto
    }

    fun contraTresDeEspada(quienJugoElTresDeEspadas: Jugador, quienJugoLaOtraCarta: Jugador): Jugador {
        return quienJugoElTresDeEspadas
    }
}