import java.util.Map;

public class Android extends Cliente {

    @Override
    public Map transform(Map congrats) {

        replaceOfflinePaymentType("offline_payment", congrats);

        return congrats;
    }
}
