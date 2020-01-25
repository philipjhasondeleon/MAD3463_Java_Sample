package com.lambton;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class StudentMainClass
{
    public static void main(String[] args)
    {

        Student s1 = new Student();
        /*LocalDate s1BirthDate;
        s1BirthDate = LocalDate.of(1997, Month.MARCH, 02);
         */

        s1.setData(1,"Philip","De Leon", new Date(1997, 02, 02), Gender.MALE, 70);

        s1.printData();






    }
}
