package shippings;

import payments.Boleto;

public class InconsistenciaDePago extends Inconsistencia {
    private final Boleto pago;
    private final Express envio;

    public InconsistenciaDePago(Express envio, Boleto pago) {
        this.envio = envio;
        this.pago = pago;
    }

    @Override
    public Inconsistencia happens() {
        if (pago.alcanza(envio)) {
            return new NoHayInconsistencia();
        }

        return this;
    }

    @Override
    public Inconsistencia challenge(Inconsistencia otherInconsistency) {
        return this;
    }
}
