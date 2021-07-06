import animals.*;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) throws VoiceException {

        Worker John = new Worker();
        Grass potato = new Grass(3);
        Meat rabbit = new Meat(4);
        Meat whale = new Meat(2);
        Zebra Alfa = new Zebra("Альфа", 80);
        Donkey Beta = new Donkey("Бета", 80);
        Duck Charlie = new Duck("Чарли", 80);
        Fish killer_whale = new Fish("Танк", 80);
        Tiger Echo = new Tiger("Эхо", 80);
        John.feed(rabbit, Charlie);
        John.feed(potato, Beta);
        John.feed(whale, killer_whale);
        John.feed(potato, Echo);
        John.getVoice(Charlie);
        John.getVoice(Echo);
        John.getVoice(Beta);
        Echo.run();
//        John.getVoice(killer_whale); // для вызова исключения
        Alfa.run();
        Animal[] swimmingPools = new Animal[4];
        swimmingPools[0] = Beta;
        swimmingPools[1] = Charlie;
        swimmingPools[2] = Echo;
        swimmingPools[3] = Alfa;
        for (int i = 0; i < 4; i++) {
            System.out.println(swimmingPools[i].toString());
        }


    }

}
