import animals.*;
import food.Grass;
import food.Meat;
import animals.Swim;
public class Zoo{
        public static void main(String[] args) throws VoiceException {

                Worker John = new Worker();
                Grass potato = new Grass();
                Meat rabbit = new Meat();
                Meat whale = new Meat();
                Zebra Alfa = new Zebra("Альфа", 80, true);
                Donkey Beta = new Donkey("Бета", 80, true);
                Duck Charlie = new Duck("Чарли", 80, true);
                Fish killer_whale = new Fish("Танк", 80, false);
                Tiger Echo = new Tiger("Эхо", 80, true);
                Animal[] swimmingPools = new Animal[4];
                swimmingPools[0] = Beta;
                swimmingPools[1] = Charlie;
                swimmingPools[2] = Echo;
                swimmingPools[3] =Alfa;
                for (int i = 0; i < 4;i++) {
                        System.out.println(swimmingPools[i].toString());
                }
                John.feed(potato, Echo);
                John.feed(rabbit, Beta);
                John.feed(whale, killer_whale);
                John.feed(potato, Echo);
                John.getVoice(Charlie);
                John.getVoice(Echo);
           //    John.getVoice(killer_whale); // для вызова исключения
                Alfa.run();

        }

}
