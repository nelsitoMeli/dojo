package steps;

public class ModalInconsistenciaDeMedioDePago implements CheckoutStep {
    public SeleccionDeEnvio cancelar() {
        return new SeleccionDeEnvio();
    }
}
