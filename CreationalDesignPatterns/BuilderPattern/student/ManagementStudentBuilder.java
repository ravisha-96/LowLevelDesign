package CreationalDesignPatterns.BuilderPattern.student;

import java.util.ArrayList;
import java.util.List;

public class ManagementStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subj = new ArrayList<>();
        subj.add("Micro Economics");
        subj.add("Macro Economics");
        subj.add("Business Studies");
        subj.add("Operations Management");
        this.subjects = subj;
        return this;
    }
}
