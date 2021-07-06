package animals;

import food.Food;
import food.Grass;

public abstract class Herbivores extends Animal {
    public Herbivores(String name, int weight) {
        super(name, weight);
    }

    public void eat(Food food) {
        int callFull = food.getCallories();
        if (food instanceof Grass) {
            System.out.println("Подопечный зоопарка ест " + callFull + " ед. растительной пищи");
            full += callFull;
        } else {
            System.out.println("Данный подопечный не ест мясо");
        }
    }

}