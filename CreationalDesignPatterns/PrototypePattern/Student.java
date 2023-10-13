package CreationalDesignPatterns.PrototypePattern;

public class Student implements Prototype{
    private String name;
    private int rollNumber;
    public int age;

    Student(String name, int rollNumber, int age){
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name: " + name + "\trollNumber:" + rollNumber + "\tage: " + age;
    }

    @Override
    public Prototype clone(){
        return new Student(name, rollNumber, age);
    }
}
