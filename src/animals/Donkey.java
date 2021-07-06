package animals;

public class Donkey extends Herbivores implements Run, Swim, Voice {
    String name;
    int weight;
    boolean exo;

    public Donkey(String name, int weight, boolean exo) {
        super(name, weight, exo);
        this.name = name;
        this.weight = weight;
        this.exo = exo;
    }

    public void sleep() {

        System.out.println("Зверёк " + name + " лёг спать");
        return;
    }

    public void run() {
        System.out.println("Бегает и играет");
    }

    @Override
    public void swim() {

        System.out.println("Осёл плавает");
    }

    @Override
    public String voice() {
        String donkeySound = "Иа";
        System.out.println(donkeySound);
        return donkeySound;
    }
}