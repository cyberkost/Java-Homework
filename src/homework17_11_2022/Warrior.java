package homework17_11_2022;

public class Warrior {
    private String name; //Поля с именами переменных
    private int weight;
    private int age;

    public Warrior(String name, int weight, int age) { // Конструктор экземпляра класса
        this.name = name; // используется в составе методов или конструкторов
        this.weight = weight;
        this.age = age;
    }

    public String getName() { // Метод возвращает значение
        return name;
    }

    public void setName(String name) { // Метод получает значение
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
    // метод в Java используется для предоставления ясной и достаточной
    // информации об объекте в удобном для человека виде.
    @Override
    public String toString() {
        return "Воин {" +
                "Имя = '" + name + '\'' +
                ", Вес = " + weight +
                ", Возраст = " + age +
                '}';
    }
}
class Main2 {
    public static void main(String[] args) {
        Warrior newWarrior = new Warrior("Конор", 80, 35); // Экземпляр класса, и задаём параметры
        System.out.println(newWarrior);
    }
}