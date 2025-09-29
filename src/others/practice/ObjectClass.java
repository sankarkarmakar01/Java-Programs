package others.practice;

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        Car that = (Car) obj;
        if (this.model.equals(that.model) && this.year == that.year) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int initialNumber = 31;
        initialNumber += year;
        initialNumber += model.hashCode();
        return initialNumber;
    }

    // @Override
    // public String toString() {
    // return "Car ka model " + model + " and year is " + year;
    // }
}

public class ObjectClass {
    public static void main(String[] args) {
        Car obj1 = new Car("Honda", 2022);
        Car obj2 = new Car("Honda", 2021);

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
