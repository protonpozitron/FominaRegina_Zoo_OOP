package animals;

public class Zebra extends Herbivores implements Run, Voice {
    String name;
    int weight;

    public Zebra(String name, int weight) {
        super(name, weight);
        this.name = name;
        this.weight = weight;
    }

    public void sleep() {
        if (full > 0) {
            System.out.println("Z-z-z-z-z");
            full -= 1;
        } else {
            this.voice();
        }
    }

    @Override
    public void run() {
        if (full > 0) {
            System.out.println("Бежит галопом");
            full -= 2;
        } else {
            this.voice();
        }
    }

    @Override
    public String voice() {
        return "Зебра по имени " + name + " ржет";
    }
}
