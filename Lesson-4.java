// Массивы

public class HelloWorld{
    
    public static void main(String []args){
        
        int[] array1 = new int[10];
        
        for(int i = 0; i < 10; i++)
            System.out.print(array1[i] + " ");
        
        System.out.println();
        
        String[] array2 = new String[5];
        
        for(int i = 0; i < 5; i++)
            System.out.print(array2[i] + " ");
            
        System.out.println();
        
        int[] array3 = { 1, 3, 6, 10, 12, 6 };
        
        for(int i = 0; i < array3.length; i++)
            System.out.print(array3[i] + " ");
        
     }
}

// Task 2

import java.util.Random;

public class HelloWorld{
    
    public static void main(String []args){
        
        int[] array = new int[15];
        
        Random r = new Random();
        
        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(100);
            
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
}

import java.util.Random;

public class HelloWorld{
    
    public static int[] generateArray(int size)
    {
        int[] array = new int[size];
        
        Random r = new Random();
        
        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(25);
            
        return array;
    }
    
    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void main(String []args){
        
        printArray(generateArray(15));
    }
}

// Task 4

import java.util.Random;

public class HelloWorld{
    
    public static double[] generateArray(int size)
    {
        double[] array = new double[size];
        
        Random r = new Random();
        
        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(25);
            
        return array;
    }
    
    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        
        System.out.println();
    }
    
    public static double[] doublingOfArray(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] * 2;
        }
        
        return array;
    }
    
    public static double[] decreasingOfArray(double[] array, double number)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] - number;
        }
        
        return array;
    }
    
    public static double[] divisionOnFirstElement(double[] array)
    {
        double temp = array[0];
        
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] / temp;
        }
        
        return array;
    }    
    
    public static void main(String []args){
        
        double[] array = generateArray(10);
        printArray(array);
        
        doublingOfArray(array);
        printArray(array);
        
        decreasingOfArray(array, 10);
        printArray(array);
        
        divisionOnFirstElement(array);
        printArray(array);
    }
}

// Task 6

import java.util.Random;

public class HelloWorld{
    
    public static double[] generateArray(int size)
    {
        double[] array = new double[size];
        
        Random r = new Random();
        
        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(25);
            
        return array;
    }
    
    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        
        System.out.println();
    }
    
    public static double findMaxElement(double[] array)
    {
        double max = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
                max = array[i];
        }
        
        return max;
    }
    
    public static double findMinElement(double[] array)
    {
        double min = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < min)
                min = array[i];
        }
        
        return min;
    }
    
    public static int findIndexOfMaxElement(double[] array)
    {
        int index = 0;
        
        double max = findMaxElement(array);
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == max)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int findIndexOfMinElement(double[] array)
    {
        int index = 0;
        
        double min = findMinElement(array);
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == min)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static void main(String []args){
        
        double[] array = generateArray(10);
        printArray(array);
        
        System.out.println(findMaxElement(array));
        System.out.println(findMinElement(array));
        
        System.out.println(findIndexOfMaxElement(array));
        System.out.println(findIndexOfMinElement(array));
        
    }
}

// Task 7

import java.util.Random;

public class HelloWorld{
    
    public static double[] generateArray(int size)
    {
        double[] array = new double[size];
        
        Random r = new Random();
        
        for(int i = 0; i < array.length; i++)
            array[i] = r.nextInt(25);
            
        return array;
    }
    
    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        
        System.out.println();
    }
    
    public static double findMaxElement(double[] array)
    {
        double max = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
                max = array[i];
        }
        
        return max;
    }
    
    public static double findMinElement(double[] array)
    {
        double min = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < min)
                min = array[i];
        }
        
        return min;
    }
    
    public static int findIndexOfMaxElement(double[] array)
    {
        int index = 0;
        
        double max = findMaxElement(array);
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == max)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int findIndexOfMinElement(double[] array)
    {
        int index = 0;
        
        double min = findMinElement(array);
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == min)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static double[] swapOfTwoElementsOfArray(double[] array, int num1, int num2)
    {
        double temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
        
        return array;
    }
    
    public static void main(String []args){
        
        double[] array = generateArray(10);
        printArray(array);
        
        swapOfTwoElementsOfArray(array, 2, findIndexOfMaxElement(array));
        printArray(array);
        
        swapOfTwoElementsOfArray(array, 1, 4);
        printArray(array);
        
    }
}

