package others.dataStructuresAndAlgorithms.coderArmy.Lecture5.HomeWork;

public class ArithmeticProgression {
    public static void main(String[] args) {
        int firstTerm = 220;
        int commonDifference = 7;
        int upperLimit = 730;
        System.out.println("Arithmetic Progression from " + firstTerm +
                " to " + upperLimit + " with common difference " +
                commonDifference + ":");
        for (int term = firstTerm; term <= upperLimit; term += commonDifference) {
            System.out.print(term + " ");
        }
        System.out.println();
    }
}
