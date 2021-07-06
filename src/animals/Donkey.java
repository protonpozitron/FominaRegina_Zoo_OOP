package animals;

public class Donkey extends Herbivores implements Run, Swim, Voice {
    String name;
    int weight;
    boolean exo;

    public Donkey(String name, int weight) {
        super(name, weight);
        this.name = name;
        this.weight = weight;
    }

    public void sleep() {
        if (full > 0) {
            System.out.println("Зверёк " + name + " лёг спать");
            full -= 1;
        } else {
            this.voice();
        }
    }

    public void run() {
        if (full > 0) {
            System.out.println("Бегает и играет");
            full -= 2;
        } else {
            this.voice();
        }
    }

    @Override
    public void swim() {
        if (full > 0) {
            System.out.println("Осёл плавает");
            full -= 3;
        } else {
            this.voice();
        }
    }

    @Override
    public String voice() {
        return "Ослик по имени " +name+ " говорит: Иа";
    }
}