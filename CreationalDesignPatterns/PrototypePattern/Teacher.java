package CreationalDesignPatterns.PrototypePattern;

public class Teacher implements Prototype{
    private String name;
    public String department;
    private int age;

    Teacher(String name, String department, int age){
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Teacher's name: "+name + "\tDepartment: " + department + "\tAge: "+ age;
    }

    @Override
    public Prototype clone(){
        return new Teacher(name, department, age);
    }
}
