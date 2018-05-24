package shippings;

public class NoHayInconsistencia extends Inconsistencia {
    @Override
    public Inconsistencia happens() {
        return this;
    }

    @Override
    public Inconsistencia challenge(Inconsistencia otherInconsistency) {
        return otherInconsistency;
    }
}
