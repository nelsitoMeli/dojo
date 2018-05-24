package steps;

import payments.Boleto;
import payments.SinPago;

public class Review implements CheckoutStep{

    private final Boleto pago;

    public Review() {
        pago = new SinPago();
    }

    public Review(Boleto boleto) {
        this.pago = boleto;
    }

    public SeleccionDeEnvio modificarEnvio() {
        return new ModificarEnvio(this, pago);
    }

    public SeleccionDeMedioDePago modificarMedioDePago() {
        return new SeleccionDeMedioDePago();
    }
}
