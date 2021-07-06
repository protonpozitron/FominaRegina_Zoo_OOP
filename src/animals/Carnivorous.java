package animals;

import food.Food;
import food.Grass;
import food.Meat;


public abstract class Carnivorous extends Animal{
    public Carnivorous(String name, int weight, boolean exo) {
        super(name, weight, exo);
    }

    public  void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Подопечный зоопарка ест мясо");
        }else {
            System.out.println("Данный подопечный не ест траву");
        }
    }

}
