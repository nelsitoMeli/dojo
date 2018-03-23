import java.util.List;
import java.util.Map;

public class Congrat {
    private final Map congrats;

    public Congrat(Map congrats) {
        this.congrats = congrats;
    }

    public Map asMap(Cliente cliente) {
        return cliente.transform(congrats);
    }
}
