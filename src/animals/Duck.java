package animals;

import food.Food;

public class Duck extends Herbivores implements Voice, Swim, Fly, Run {
    String name;
    int weight;
    boolean exo;
    public Duck(String name, int weight, boolean exo) {
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

    public void fly() {

        System.out.println("FLY!");
    }

    @Override
    public void run() {

        System.out.println("Сбегает");
    }

    @Override
    public void swim() {
        System.out.println("Утенок плавает");

    }

    @Override
    public String voice() {
        //String krya;
        System.out.println("krya");
        return null;
    }
}
