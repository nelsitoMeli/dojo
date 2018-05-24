package shippings;

import payments.Boleto;

public class Express {
    private final int costo;

    public Express(int costo) {
        this.costo = costo;
    }

    public boolean alcanza(Boleto boleto) {
        return boleto.alcanza(costo);
    }
}
