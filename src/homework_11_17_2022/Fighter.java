package homework_11_17_2022;

public class Fighter {
    private String name;
    private int weight;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        fighter.setName("Конор");
        fighter.setAge(35);
        fighter.setWeight(80);
        System.out.println("Имя бойца - " + fighter.getName());
        System.out.println("Возраст - " + fighter.getAge() + " лет");
        System.out.println("Вес - " + fighter.getWeight() + " килограмм");
    }
}