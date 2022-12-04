package homework_11_23_2022;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Practice practice1 = new Practice("abc", 3);
        Practice practice2 = new Practice("a", 4);
        Practice practice3 = new Practice("bc", 5);
        Practice practice4 = new Practice("a", 2);

        List<Practice> list = new ArrayList<>(List.of(practice1, practice2, practice3, practice4));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
