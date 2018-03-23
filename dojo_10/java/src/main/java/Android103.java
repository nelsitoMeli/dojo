import java.util.Map;

public class Android103 extends Cliente {

    @Override
    public Map transform(Map congrats) {

        replaceOfflinePaymentType("OFFLINE_PAYMENT", congrats);

        return congrats;
    }
}
