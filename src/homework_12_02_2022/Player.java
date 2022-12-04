package homework_12_02_2022;

import java.util.UUID;

public class Player {
    private UUID id;
    private String name;
    private int age;
    League league;
    private int scores = 0;

    public Player(UUID id, String name, int age, League league) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.league = league;
    }

    public Player(UUID id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public void addScores(int delta) {
        scores += delta;
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", league=" + league +
                ", scores=" + scores +
                '}';
    }
}

