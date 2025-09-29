package others.practice;

class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("Sankar");
    System.out.println(myObj.getName());
  }
}
