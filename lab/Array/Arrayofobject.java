package lab.Array;


public class Arrayofobject {
    String name;
    int age;

    public Arrayofobject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
