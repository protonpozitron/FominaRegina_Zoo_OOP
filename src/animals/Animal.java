package animals;

import food.Food;

public abstract class Animal implements Voice {
    private String name;
    private int weight;
    public int full;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;

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

    public String toString() {
        return "Подопечный по имени " + this.name + " плавает в пруду";
    }

}
