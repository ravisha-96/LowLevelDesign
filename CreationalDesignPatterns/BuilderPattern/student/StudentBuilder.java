package CreationalDesignPatterns.BuilderPattern.student;

import java.util.List;

public abstract class StudentBuilder {
    public String name;
    public int rollNumber;
    public int age;
    public String father;
    public String mother;
    public List<String> subjects;

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentBuilder setFather(String father){
        this.father = father;
        return this;
    }

    public StudentBuilder setMother(String mother){
        this.mother = mother;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public Student build(){
        return new Student(this); // most important
    }
}
