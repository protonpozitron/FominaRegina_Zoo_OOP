package animals;

import food.Food;
import food.Grass;

public abstract class Herbivores extends Animal {
    Grass apple = new Grass();
    public Herbivores(String name, int weight, boolean exo) {
        super(name, weight, exo);
    }

    public  void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Подопечный зоопарка ест траву");
        }else {
            System.out.println("Данный подопечный не ест мясо ");
        }
    }

}