package animals;

import food.Food;
import food.Meat;


public abstract class Carnivorous extends Animal {
    public Carnivorous(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat(Food food) {
        int callFull = food.getCallories();
        if (food instanceof Meat) {
            System.out.println("Подопечный зоопарка ест " + callFull + " мясных ед. ");
            full += callFull;
        } else {
            System.out.println("Данный подопечный не ест траву");
        }
    }

}
