package homework_12_02_2022;

import com.github.javafaker.Faker;

import java.util.Random;
import java.util.UUID;

public class Generator {

    public static void makePlayer() {
        Random random = new Random();
        Faker faker = new Faker();
        for (int i = 0; i < 26; i++) {
            PlayersManager.getInstance().addPlayer(
                    new Player(UUID.randomUUID(), faker.name().lastName(), random.nextInt(10, 50)));
        }
    }
}
