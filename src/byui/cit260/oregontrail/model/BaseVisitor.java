package byui.cit260.oregontrail.model;

public abstract class BaseVisitor {
    public abstract void visitElement(Actor actor);
    public double getSum() { return 0; }
    public double getMin() { return 0; }
    public double getMax() { return 0; }
}
