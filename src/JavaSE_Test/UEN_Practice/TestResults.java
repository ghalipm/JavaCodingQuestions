package JavaSE_Test.UEN_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class TestResults
{
    public static class Student {
        private String name;
        private int score;
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        public int getScore() {
            return score;
        }
        public String getName() {
            return name;
        }
    }
    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {
        List<Student> passingStudents = new ArrayList<>();
                students.filter(p-> p.score>=passingScore).forEach(passingStudents::add);

                List<String> passingStudentsList=new ArrayList<>();
        for (int i = 0; i <passingStudents.size() ; i++) {
            passingStudentsList.add("Name: "+passingStudents.get(i).getName()+", Score: "+passingStudents.get(i).getScore());
        }


return passingStudentsList;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("“Mike”", 80));
        students.add(new Student("“James”", 57));
        students.add(new Student("“Alan”", 21));
        studentsThatPass(students.stream(), 50).forEach(System.out::println);
    }
}