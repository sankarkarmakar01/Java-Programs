package others.practice;

public class Lambda {
    public static void main(String[] args) {
        Walkable obj = (steps) -> {
            System.out.println("Walks " + steps);
            return steps;
        };
        obj.walks(10);
        Walkable obj2 = (steps) -> 2 * steps;
        System.out.println(obj2.walks(10));
    }
}

interface Walkable {
    int walks(int steps);
}