package com.dojo.unlm

class CAU(val lista: List<Aula>) {
    fun buscar(solicitud: Solicitud): Etiqueta {
        /*val aula = lista.reduce {
            acc, aula ->
            solicitud.buscarAulaQueAplica(, aula)
        }
        return aula*/
        var aula = solicitud.buscarAulaQueAplica(lista)
        return aula.printEtiqueta()
    }
}
