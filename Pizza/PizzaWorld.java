import greenfoot.*;
public class PizzaWorld extends World {
    public PizzaWorld() {
        super(600, 400, 1); 
        Pizza pizza1 = new Pizza("Pepperoni", 5);
        Pizza pizza2 = new Pizza("Veggie", 8);
        addObject(pizza1, 300, 200); 
        addObject(pizza2, 100, 100);
    }
}