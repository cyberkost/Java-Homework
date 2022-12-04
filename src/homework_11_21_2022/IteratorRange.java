package homework_11_21_2022;

public class IteratorRange {
    public static void main(String[] args) {
        for (int i : Range.fromTo(0, 99)) {
            System.out.println(i);
        }
    }

    private static class Range implements Iterable<Integer> {
        int start; // Начало и конец диапазона чисел
        int end;

        public static Range fromTo(int from, int to) {
            return new Range(from, to);
        }

        public Range(int start, int end) { // Конструктор
            this.start = start;
            this.end = end;
        }

        @Override
        public Iterator iterator() {
            return new Iterator(start);
        } // Метод возвращающий итератор, передаём начальное значение

        class Iterator implements java.util.Iterator<Integer> { // Класс Итератор
            int current; // Переменная для хранения текущего значения

            public Iterator(int current) {
                this.current = current;
            } // Задаём с какого значения начинаем

            @Override
            public boolean hasNext() {
                return current <= end;
            } // Создаём два главных метода

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}
