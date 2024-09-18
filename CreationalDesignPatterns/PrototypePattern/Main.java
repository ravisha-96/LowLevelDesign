package CreationalDesignPatterns.PrototypePattern;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ravi", 0, 0);
        Student student1Clone = (Student)student1.clone();
        System.out.println("this is student1: " + student1);
        student1Clone.age = 34;
        System.out.println("This is student2: " + student1Clone);

        Teacher teacher1 = new Teacher("R R Suman", "CSE", 55);
        Teacher teacher2 = (Teacher)teacher1.clone();
        System.out.println("Teacher1: "+teacher1);
        //Let's say the department of teacher1 has changed
        teacher2.department = "ECE";
        System.out.println("Teacher2: " + teacher2);
    }
    
}
