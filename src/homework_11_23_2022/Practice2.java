package homework_11_23_2022;

public class Practice2 implements Comparable<Practice2> {
    String name;
    String surname;

    public Practice2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "{" + name + " , " + surname + "}";
    }

    @Override
    public int compareTo(Practice2 o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        }
        return result;
    }

}