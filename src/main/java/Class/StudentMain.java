package Class;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        String firstName = "Leon";
        String lastName = "Hunter";
         Double[] examScores = {100.8, 69.0, 65.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);

        Double[] examScoress = {100.6, 90.8, 80.9, 87.8};

        Double[] examScoresss = {109.0, 109.7, 82.9, 87.2};



        Student student1 = new Student("jim", "bob", examScoress);
        Student student2 = new Student("jim", "bob", examScoresss);


        Student [] students = {student, student1, student2};

        System.out.println(student.getExamScores());
       student.addExamscore(100.0);
       System.out.println(student.getExamScores());
        student.setExamScore(0,1.7);
        System.out.println(student.getExamScores());
        System.out.println(student.getAverageExamScore());
        System.out.println(student);
      Double output = student.getAverageExamScore();
        System.out.println(output);
      System.out.println(student);


    }


}
