package byui.cit260.oregontrail.model;

public class MaxVisitor extends BaseVisitor {
    double max;
    public void visitElement(Actor actor){
        if (actor != null) {
        max = Math.max(actor.getMoney(), max);
        }
        else {
            System.err.println("Null actor.");
        }
    }
    
    public double getMax(){
        return max;
    }
}

