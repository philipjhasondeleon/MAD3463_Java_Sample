package com.lambton;

public class Arithmetic
{
    int add(int x, int y)
    {
        return x + y;
    }

    float add(float x, float y)
    {
        return x + y;
    }

    String add(String x, String y)
    {
        return x + y;
    }

    int add(int x, int y, int z)
    {
        return x + add(y, z);
    }

    float add(int x, int y, float z)
    {
        return (float)add(x, y) + z;
    }
   /*
    String add(String x, String y)
    {
        return x + y;
    }
    String add(String x, String y)
    {
        return x + y;
    }





}
