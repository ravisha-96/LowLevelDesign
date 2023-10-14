package CreationalDesignPatterns.BuilderPattern.student;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuidler){
            return createEngineeringStudent();
        }
        if(studentBuilder instanceof ManagementStudentBuilder){
            return createManagementStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
        return studentBuilder.setName("raijada").setRollNumber(10).setAge(30)
        .setFather("raijada senior").setMother("raijadi").setSubjects().build();
    }

    private Student createManagementStudent(){
        return studentBuilder.setName("raijada").setRollNumber(10).setAge(30)
        .setFather("raijada senior").setMother("raijadi").setSubjects().build();
    }
}
