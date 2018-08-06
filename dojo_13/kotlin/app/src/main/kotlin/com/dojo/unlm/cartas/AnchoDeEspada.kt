package com.dojo.unlm.cartas

import com.dojo.unlm.Jugador

class AnchoDeEspada : Carta {

    override fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        return quienJugoMiCarta
    }

    override fun contraAnchoDeBasto(quienJugoElAnchoDeBasto: Jugador, quienJugoLaOtraCarta: Jugador): Jugador {
        return quienJugoLaOtraCarta
    }
}
