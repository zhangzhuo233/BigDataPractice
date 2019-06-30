package com.bd.javaTest;

class ChangeIt
{
    static void doIt( int[] z )
    {
        int[] A = z;
        A[0] = 99;
    }
}

class MyTest
{
    public static void main( String[] args )
    {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt(myArray);
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.print(myArray[i] + " ");
        }
    }
}
