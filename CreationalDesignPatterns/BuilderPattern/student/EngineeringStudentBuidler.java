package CreationalDesignPatterns.BuilderPattern.student;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuidler extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subj = new ArrayList<>();
        subj.add("DSA");
        subj.add("OS");
        subj.add("Compiler Design");
        subj.add("DBMS");
        this.subjects = subj;
        return this;
    }
}
