package steps;

import payments.Boleto;
import shippings.Express;
import shippings.InconsistenciaDePago;
import shippings.Inconsistencia;
import shippings.NoHayInconsistencia;

import java.util.Arrays;
import java.util.List;

public class ModificarEnvio extends SeleccionDeEnvio {
    private final Boleto pago;

    public ModificarEnvio(Review review, Boleto pago) {
        super(review);
        this.pago = pago;
    }

    @Override
    public CheckoutStep expressADomicilio(Express envio) {
        List<Inconsistencia> inconsistencies =
            Arrays.asList(
                    new NoHayInconsistencia(),
                    new InconsistenciaDePago(envio, pago)
                    );

        Inconsistencia inconsistencia = inconsistencies.stream()
                .map(Inconsistencia::happens)
                .reduce(Inconsistencia::challenge)
                .get();

        if (inconsistencia instanceof InconsistenciaDePago) {
            return new ModalInconsistenciaDeMedioDePago();
        }

        return super.expressADomicilio(envio);
    }
}
