package animals;

import food.Food;

public class Zebra extends Herbivores implements Run, Voice{
    String name;
    int weight;
    boolean exo;
    public Zebra(String name, int weight, boolean exo) {
        super(name, weight, exo);
        this.name=name;
        this.weight=weight;
        this.exo=exo;
    }

    public void setZebra(String name, int weight, boolean exo) {
        this.name=name;
        this.weight=weight;
        this.exo=exo;

    }
    public void eat(Food food) {
    }


    public void sleep() {
        System.out.println("Z-z-z-z-z");
    }

    @Override
    public void run() {
        System.out.println("Бежит галопом");
    }

    @Override
    public String voice() {
        String zebSound = "Ржет";
        System.out.println(zebSound);
        return zebSound;
    }
}
