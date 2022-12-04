package homework_11_23_2022;
// Input: { {"abc", 3}, {"a", 4}, {"bc", 5}, {"a", 2} }
// Output: { {"a", 2}, {"a", 4}, {"abc", 3}, {"bc", 5} }
// 1. Отсортировать массив стрингов как на рисунке
// 2. В наших классах которые мы пищем, все сущности заимплементить от Comparable

public class Practice implements Comparable<Practice>{
    String name;
    int id;

    public Practice(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "{ " +  name + ", " + id + " }";
    }

    @Override
    public int compareTo(Practice obj) {
        int res = this.name.compareTo(obj.name);
        if (res == 0) {
            res = this.id - obj.id;
        }
        return res;
    }
}



