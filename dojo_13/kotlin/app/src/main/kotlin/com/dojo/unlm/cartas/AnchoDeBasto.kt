package com.dojo.unlm.cartas

import com.dojo.unlm.Jugador

class AnchoDeBasto : Carta {
    override fun contra(cartaOponente: Carta, quienJugoMiCarta: Jugador, oponente: Jugador): Jugador {
        //siempre gana, excepto ancho de espada
        return cartaOponente.contraAnchoDeBasto(oponente, quienJugoMiCarta)
    }

    override fun contraTresDeEspada(quienJugoElTresDeEspadas: Jugador, quienJugoLaOtraCarta: Jugador): Jugador {
        return quienJugoLaOtraCarta
    }
}
