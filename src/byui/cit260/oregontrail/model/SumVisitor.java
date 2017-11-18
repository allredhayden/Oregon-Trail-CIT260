package byui.cit260.oregontrail.model;

public class SumVisitor extends BaseVisitor {
    double sum;
    public void visitElement(Actor actor){
        if (actor != null) {
        sum += actor.getMoney();
        }
        else {
            System.err.println("Null actor.");
        }
    }
    
    public double getSum() {
        return sum;
    }
}
