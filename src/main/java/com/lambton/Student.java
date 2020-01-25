package com.lambton;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

enum Gender
{
    MALE,
    FEMALE,
    OTHERS
}
public class Student
{
    int studentId;
    String firstName;
    String lastName;
    Date birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId,
        String firstName,
        String lastName,
        Date birthDate,
        Gender gender,
        float totalMarks)
    {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;

        this.gender = gender;
        this.totalMarks = totalMarks;

        LocalDate localDate;
        localDate = LocalDate.of(1997, Month.MARCH, 02);

    }
    public void  printData()
    {
        System.out.println("Student Id: " + studentId);
        System.out.println("Student First Name: " + firstName);
        System.out.println("Student Last Name: " + lastName);
        System.out.println("Student BirthDate: " + birthDate);

        System.out.println("Student Gender: " + gender);
        System.out.println("Student Total Marks: " + totalMarks);


    }
/*
    private int getStudentAge()
    {
        int age;

    }
*/





}
