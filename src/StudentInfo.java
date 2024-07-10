import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class StudentInfo {
    private String name;
    private String grade;

    StudentInfo(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(String studentGrade) {
        List<String> validGrades = new ArrayList<>();
        validGrades.add("A");
        validGrades.add("B");
        validGrades.add("C");
        validGrades.add("D");
        validGrades.add("F");
        if (validGrades.contains(studentGrade))
            this.grade = studentGrade;
    }

    public String getGrade() {
        return grade;
    }
}

class StudentInfoRes {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo("Waleed", "A");
        System.out.println("Student Name is => " + studentInfo.getName() +
                "\nStudent Grade is =>" + studentInfo.getGrade());
        studentInfo.setGrade("B");
        studentInfo.setName("Ali");
        System.out.println("Student Name is => " + studentInfo.getName() +
                "\nStudent Grade is => " + studentInfo.getGrade());
    }
}