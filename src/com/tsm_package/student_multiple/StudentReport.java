package com.tsm_package.student_multiple;

//import com.tsm_package.student_multiple.StudentGradeCalculator;

public class StudentReport{

    public static void main(String[] args) {
        System.out.println(" Student report generating....");

        StudentGradeCalculator studentGradeCalculator=new StudentGradeCalculator();
        studentGradeCalculator.gradeCalculator();

        StudentMarksPrinter studentMarksPrinter=new StudentMarksPrinter();
        studentMarksPrinter.marksPrinter();

        System.out.println(" Student report generated !!");
    }

}