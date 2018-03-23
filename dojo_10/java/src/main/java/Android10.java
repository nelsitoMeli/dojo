import java.util.Map;

public class Android10 extends Cliente {

    @Override
    public Map transform(Map congrats) {
        removeSection("exit", congrats);

        replaceOfflinePaymentType("offline_payment", congrats);

        return congrats;
    }
}
