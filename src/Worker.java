import animals.Animal;
import animals.VoiceException;
import food.Food;

public class Worker {
    boolean error;
    public Animal animal1;
    public boolean soundEcho=true;
    public void feed(Food food1, Animal animal1) {
        animal1.eat(food1);
    }

    public void getVoice(Animal animal1) throws VoiceException {
        if (!animal1.isExo()) {throw new VoiceException();}
        else {
            animal1.voice();
        }
    }
}

