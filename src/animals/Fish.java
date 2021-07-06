package animals;

import food.Food;

public class Fish extends Carnivorous implements Swim, Voice {
    String name;
    int weight;
    boolean exo,abswim;
    public Fish(String name, int weight, boolean exo) {
        super(name, weight, exo);
        this.name=name;
        this.weight=weight;
        this.exo=exo;
    }

    public void eat(Food food) {

    }
    public void sleep() {
        System.out.println("Z-z-z-z-z");
    }

    public void swim() {
        System.out.println("Плавает кругами");
    }

    public String voice() {
        return null;
    }
}
