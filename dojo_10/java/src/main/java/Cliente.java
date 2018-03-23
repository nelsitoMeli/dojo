import java.util.List;
import java.util.Map;

public abstract class Cliente {
    public abstract Map transform(Map congrats);

    protected void removeSection(String sectionName, Map congrats) {
        ((List<Map>)congrats.get("sections")).removeIf(x -> x.get("type").equals(sectionName));
    }

    protected void replaceOfflinePaymentType(String newTypeName, Map congrats) {
        ((List<Map>)congrats.get("sections")).get(0).put("type", newTypeName);
    }
}
