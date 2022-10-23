package casting;
public class Game {
    public void test() {
        System.out.println("Игра протестирована");
    }
    public static class Animal extends Game {
    }
    public static class Cat extends Animal {
        public void posvetitLazerom() {
            System.out.println("Вы посветели лазером на стену, Коту весело");
        }
    }
    public static class Dog extends Animal {
        public void kinutMyach(){
            System.out.println("Вы кинули мяч, собаке весело");
        }
    }
    public static class Hamster extends Animal {
        public void datKorm() {
            System.out.println("Вы дали хомяку корм, хомяку весело");
        }
    }

    public static class Snake extends Animal {

        public void datKorm2(){
            System.out.println("Вы покормили змею, ей хорошо");
        }
    }
    public static class UsersDog extends Dog {
        public static void main(String[] args) {
            UsersDog Tuzik = new UsersDog();
            Tuzik.kinutMyach();
            Tuzik.test();
        }
    }
    public static class UsersCat extends Cat {
        public static void main(String[] args) {
            UsersCat Murzik = new UsersCat();
            Murzik.posvetitLazerom();
            Murzik.test();
        }
    }
    public static class UsersHamster extends Hamster {
        public static void main(String[] args) {
            UsersHamster Homa = new UsersHamster();
            Homa.datKorm();
            Homa.test();
        }
    }
    public static class UsersSnake extends Snake {
        public static void main(String[] args) {
            UsersSnake Zmei = new UsersSnake();
            Zmei.datKorm2();
            Zmei.test();
        }
    }
}