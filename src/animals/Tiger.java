package animals;

public class Tiger extends Carnivorous implements Swim, Run, Voice {
    String name;
    int weight;
    boolean exo,abswim;

    public Tiger(String name, int weight, boolean exo) {
       super(name, weight, exo);
        this.name = name;
        this.weight = weight;
        this.exo = exo;
    }

    public void sleep() {
        System.out.println("Z-z-z-z-z");
    }

    public void run() {
        System.out.println("Бегает");
    }

    public void swim() {
        System.out.println("Тигр плавает");
    }

    @Override
    public String voice() {
        System.out.println("Мур");
        return null;
    }
    }

