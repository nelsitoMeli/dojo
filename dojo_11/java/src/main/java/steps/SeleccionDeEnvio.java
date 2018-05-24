package steps;

import shippings.Envio;
import shippings.Express;

public class SeleccionDeEnvio implements CheckoutStep {

    private final CheckoutStep suggestedStep;

    public SeleccionDeEnvio() {
        this.suggestedStep = new SeleccionDeMedioDePago();
    }

    public SeleccionDeEnvio(CheckoutStep suggestedStep) {
        this.suggestedStep = suggestedStep;
    }

    public CheckoutStep envioADomicilio(Envio envio) {
        return suggestedStep;
    }

    public CheckoutStep retiroEnCorreo() {
        return new MapaDeSucursales();
    }

    public CheckoutStep expressADomicilio(Express express) {
        return suggestedStep;
    }
}
