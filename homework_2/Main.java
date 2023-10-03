package homework_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import homework_2.Fabric.*;


public class Main {
    public static void main(String[] args) {

        // Рандомайзер
        Random random = ThreadLocalRandom.current();

        // Инициализация фабрик и их списка
        List<ItemGenerator> fabrics = initFabrics();


        for (int i = 0; i < 200; i++) {
            int index = random.nextInt(fabrics.size());
            fabrics.get(index).openReward();
        }
    }

    // Фабричный инициализатор
    public static List<ItemGenerator> initFabrics() {
        List<ItemGenerator> fabrics = new ArrayList<>();

        fabrics.add(new GemGenerator());

        for(int i = 0; i < 3; i++){
            fabrics.add(new GoldGenerator());
        }

        for(int i = 0; i < 10; i++){
            fabrics.add(new SilverGenerator());
            fabrics.add(new PlatinumGenerator());
            fabrics.add(new CopperGenerator());
            fabrics.add(new TreeGenerator());
            fabrics.add(new PlasticGenerator());
            fabrics.add(new PaperGenerator());
        }
        return fabrics;
    }
}
