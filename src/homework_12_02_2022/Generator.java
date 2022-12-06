package homework_12_02_2022;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Generator {
    public static void makePlayerSecond() {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < 25; i++)
            PlayersManager.getInstance().addPlayer(
                    new Player(UUID.randomUUID(), faker.name().lastName(), random.nextInt(15, 20))
            );
    }

    public static void makePlayerFirst() {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < 25; i++)
            PlayersManager.getInstance().addPlayer(
                    new Player(UUID.randomUUID(), faker.name().lastName(), random.nextInt(21, 30))
            );
    }

    public static void makePlayerPrime() {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < 25; i++)
            PlayersManager.getInstance().addPlayer(
                    new Player(UUID.randomUUID(), faker.name().lastName(), random.nextInt(31, 40))
            );
    }
}
