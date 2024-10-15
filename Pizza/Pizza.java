import greenfoot.*;

public class Pizza extends Actor {
    private String type;
    private int size;
    private Actor toppings;

    // Constructor
    public Pizza(String theType, int theSize) {
        type = theType;
        size = theSize;
        
    }

    @Override
    protected void addedToWorld(World world) {
        // Adding a Cheese topping, more will be added later
        toppings = new Cheese();
        world.addObject(toppings, getX(), getY());
    }
}
