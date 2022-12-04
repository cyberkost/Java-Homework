package homework_11_23_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Practice2 task1 = new Practice2("abc", "last");
        Practice2 task2 = new Practice2("pklz", "yelp");
        Practice2 task3 = new Practice2("rpng", "note");
        Practice2 task4 = new Practice2("ppza", "xyz");

        List<Practice2> list = new ArrayList<>(List.of(task1, task2, task3, task4));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
