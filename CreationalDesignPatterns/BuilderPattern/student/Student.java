package CreationalDesignPatterns.BuilderPattern.student;

import java.util.List;

public class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String father;
    private String mother;
    private List<String> subjects;

    Student(StudentBuilder studentBuilder){
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.rollNumber = studentBuilder.rollNumber;
        this.father = studentBuilder.father;
        this.mother = studentBuilder.mother;
        this.subjects = studentBuilder.subjects;
    }

    public String toString(){
        return "name " + this.name +
                "\tage " + this.age +
                "\trollNumber "+ this.rollNumber +
                "\tfather "+ this.father +
                "\tmother "+ this.mother +
                "\tsubjects " + this.subjects.get(0) + " "+ this.subjects.get(1) + " "+this.subjects.get(2);
    }
}
