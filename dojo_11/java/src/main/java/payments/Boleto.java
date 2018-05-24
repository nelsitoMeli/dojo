package payments;

import shippings.Express;

public class Boleto {
    private final int limite;

    public Boleto(int limite) {
        this.limite = limite;
    }

    public boolean alcanza(Express express) {
        return express.alcanza(this);
    }

    public boolean alcanza(int costo) {
        return costo < limite;
    }
}
