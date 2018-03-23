import java.util.List;
import java.util.Map;

public class iOS extends Cliente {

    @Override
    public Map transform(Map congrats) {

        replaceOfflinePaymentType("mlu_offline_payment", congrats);

        return congrats;
    }
}
