import StudentStuff.Student;
import StudentStuff.StudentGroupManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private int numberOfStudents;
    private Student[] students;
    private Scanner input = new Scanner(System.in);
    private int[] abilityLevelTotals = new int[]{0,0,0,0,0,0} ;
    public static void main(String[] args){
        new Main();
    }

    private Main(){
        System.out.println("Enter in number of students");
        numberOfStudents = input.nextInt();
        students = new Student[numberOfStudents];
        System.out.println("Enter in student data");
        enterInStudentData();
        Student[][] studentsArrangedBySkillLevel = StudentGroupManipulation.arrangeStudents(students, abilityLevelTotals);
    }

    private void enterInStudentData() {
        String studentName;
        int abilityLevel;
        float grade;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("enter in student name");
            studentName = input.next();
            System.out.println("give ability level 0-5");
            abilityLevel = input.nextInt();
            abilityLevelTotals[abilityLevel] ++;
            System.out.println("give grade (100 point scale, one decimal place, no % symbol)");
            grade = input.nextFloat();
            students[i] = new Student(studentName, grade, abilityLevel);
        }
    }


}
