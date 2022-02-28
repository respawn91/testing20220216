// Считывание элементов массива из входящего потока данных

import java.util.Scanner;

public class HelloWorld{

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        
        System.out.println();
    }

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[10];
        
        for(int i = 0 ; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        
        printArray(array);
        
     }
}

// Двумерный массив

public class HelloWorld{

     public static void main(String []args){
        
        
        int[][] array = new int[3][4];
        
        for(int i = 0 ; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
     }
}

// Вектора:
https://codeboard.io/projects/216326

// Queue
https://codeboard.io/projects/294054

// ArrayList

import java.util.ArrayList;

public class HelloWorld{

    public static void printArrayList(ArrayList<String> list)
    {
        for(int i = 0; i < list.size(); i++)
            {
                System.out.print(list.get(i) + " ");
            }
        System.out.println();
    }

    public static void main(String []args){
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Anton");
        printArrayList(list);
        
        list.add("Eugene");
        printArrayList(list);
        
        list.add(0, "Anna");
        printArrayList(list);
        
        list.add(1, "Kate");
        printArrayList(list);
        
        list.remove(2);
        printArrayList(list);
        
        list.add("Anton");
        printArrayList(list);
        list.set(3, "Kirill");
        printArrayList(list);
    }
}