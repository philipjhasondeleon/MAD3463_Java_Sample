package com.lambton;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class StudentMainClass
{
    public static void main(String[] args)
    {

        //Student[] listOfStudents=new Student[2];

        LocalDate s1BirthDate;
        s1BirthDate = LocalDate.of(1997, Month.MARCH, 02);
        Student s1 = new Student(1,"philip","deleon",s1BirthDate,Gender.MALE,20,50,45, 60,70);



        s1.calculateTotalMarks();
        s1.calculatePercentage();
        s1.calculateResult();
        s1.printData();


       //listOfStudents



    }
}


