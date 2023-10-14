package CreationalDesignPatterns.BuilderPattern.student;

public class Client {
    public static void main(String[] args) {
        Director dir1 = new Director(new EngineeringStudentBuidler());
        Director dir2 = new Director(new ManagementStudentBuilder());
        Student engStud = dir1.createStudent();
        Student mgmtStud = dir2.createStudent();

        System.out.println(engStud.toString());
        System.out.println(mgmtStud.toString());
        
        System.out.println();
        StudentBuilder studentBuilder = new EngineeringStudentBuidler();
        Student stud3 = studentBuilder.setName("Ravi")
        .setAge(30)
        .setFather("Ravi Senior")
        .setMother("Ravi Seniorni")
        .setRollNumber(23)
        .setSubjects()
        .build();
        System.out.println(stud3);
    }
}
