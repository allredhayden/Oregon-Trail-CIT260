package byui.cit260.oregontrail.model;

public class MinVisitor extends BaseVisitor {
    double min;
    public void visitElement(Actor actor){
        if (actor != null) {
        min = Math.min(actor.getMoney(), min);
        }
        else {
            System.err.println("Null actor.");
        }
    }
    
    public double getMin(){
        return min;
    }
}
