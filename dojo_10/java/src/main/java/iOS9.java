import java.util.Map;

public class iOS9 extends Cliente {

    @Override
    public Map transform(Map congrats) {
        removeSection("exit", congrats);

        replaceOfflinePaymentType("mlu_offline_payment", congrats);

        return congrats;
    }
}
