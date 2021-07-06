package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Animal implements Voice {
    private String name;
    private int weight;
    private boolean exo;
    protected  boolean abswim;
    int full;
    protected static int numSwim;
    public Animal[] swimmingMassive = new Animal[5];
    public Animal(String name, int weight, boolean exo) {
        this.name = name;
        this.weight = weight;
        this.exo = exo;//немые или нет

    }
    public void eat(Food food) {

    }

    public abstract void sleep();

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {

        return weight;
    }

    public boolean isExo() {
        return exo;
    }
 public String toString(){
        return "Подопечный по имени "+name + " " +super.toString() + " плавает в пруду";
 }

}
