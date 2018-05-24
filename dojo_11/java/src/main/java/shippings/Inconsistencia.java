package shippings;

public abstract class Inconsistencia {
    public abstract Inconsistencia happens();
    public abstract Inconsistencia challenge(Inconsistencia otherInconsistency);
}
