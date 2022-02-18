// Циклы

// Даны два числа. Если первое меньше второго на 10, увеличить первое в 2 раза
public class HelloWorld{

     public static void main(String []args){
        
        int a = 30;
        int b = 35;
        
        System.out.println("a = " + a);
        
        if((b - a) >= 10) 
        {
            a = a * 2;
        }
            
        System.out.println("a = " + a);
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int a = 20;
        int b = 35;
        
        System.out.println("a = " + a);
        
        boolean x = (b - a) >= 10;
        
        if(x) 
        {
            a = a * 2;
        }
            
        System.out.println("a = " + a);
     }
}

// Даны два числа. Если первое меньше второго на 10, увеличить первое в 2 раза. В противном случае увеличить второе на 5
public class HelloWorld{

     public static void main(String []args){
        
        int a = 20;
        int b = 35;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        if((b - a) >= 10) 
        {
            a = a * 2;
        }
        else
        {
            b = b + 5;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
     }
}

// Работа с циклом
public class HelloWorld{

     public static void main(String []args){

        for(int i = 1; i <= 10; i++)
        {
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        for(int j = 1; j <= 10; j = j + 2)
        {
            System.out.print(j + " ");
        }
        
        System.out.println();
        
        for(int k = 1; k <= 10; k = k * 2)
        {
            System.out.print(k + " ");
        }
        
     }
}

// Task 1
public class HelloWorld{

     public static void main(String []args){
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print("20 ");
        }
     }
}

// Task 2
public class HelloWorld{

     public static void main(String []args){
        
        for(int i = 10; i <= 25; i++)
        {
            System.out.println(i + " " + i + ".4");
        }
     }
}

// Task 3
public class HelloWorld{

     public static void main(String []args){
        
        for(int i = 1; i <= 9; i++)
        {
            System.out.printf("%d x 7 = %d\n", i, i * 7);
        }
     }
}

// Task 4
public class HelloWorld{

     public static void main(String []args){
        
        int sum = 0;
        
        for(int i = 100; i <= 500; i++)
        {
            System.out.println("i = " + i);
            System.out.println("old sum = " + sum);
            sum = sum + i;
            System.out.println("new sum = " + sum);
            System.out.println("==================");
        }
        
        System.out.println("sum = " + sum);
     }
}
public class HelloWorld{

     public static void main(String []args){
        
        int a = 100;
        int b = 500;
        
        int sum = 0;
        
        boolean condition = (b >= a);
        
        if(condition == true)
        {
            for(int i = a; i <= b; i++)
            {
                sum = sum + i;
            }
            
            System.out.println("sum = " + sum);
        }
        else
        {
            System.out.println("Incorrect range");
        }
     }
}

// WHILE and DO WHILE
public class HelloWorld{

     public static void main(String []args){
        
        int i = 0;
        
        while(i <= 10)
        {
            System.out.print(i + " ");
            i++;
        }
    
        System.out.println();
        
        int k = 0;
        
        do
        {
            System.out.print(k + " ");
            k++;
        }
        while(k <= 10);
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int i = 10;
        
        while(i < 10)
        {
            System.out.print(i + " ");
            i++;
        }
    
        System.out.println();
        
        int k = 10;
        
        do
        {
            System.out.print(k + " ");
            k++;
        }
        while(k < 10);
     }
}

// Task 11
public class HelloWorld{

     public static void main(String []args){
     
     for(int i = 5000; i >= 0; i--)
     {
        if(i % 39 == 0)
        {
            System.out.println(i);
            break;
        }
     }
     
     int number = 5000;
     
     while(number % 39 != 0)
     {
         number--;
     }
     
     System.out.println(number);
    }
}

// Функции и методы

// Найти наибольшее их двух чисел
public class HelloWorld{
    
    public static int maxOfTwoElements(int a, int b)
    {
        int max;
        
        if(a > b)
            max = a;
        else
            max = b;
        
        return max;
    }
    
    public static void main(String []args){
        
        int a = 200;
        int b = 200;
        
        System.out.println(maxOfTwoElements(a, b));
    }
}

public class HelloWorld{
    
    public static int maxOfTwoElements(int a, int b)
    {
        int max;
        
        if(a > b)
            max = a;
        else
            max = b;
        
        return max;
    }
    
    public static void printOfText(int a)
    {
        System.out.println("I am printing!");
        System.out.println(a);
        System.out.println("Done!");
    }
    
    public static void main(String []args){
        
        int a = 200;
        int b = 200;
        
        printOfText(maxOfTwoElements(a, b));
        
    }
}

// Task 1
public class HelloWorld{
    
    public static void print1()
    {
        for(int i = 1; i <= 4; i++)
        {
            System.out.println("5 5 5 5 5 5");
        }
    }
    
    public static void print2(int number, int columns, int rows)
    {
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= columns; j++)
            {
                System.out.print(number + " ");    
            }
            System.out.println();
        }
    }
    
    public static void main(String []args){
        
        print1();
        
        System.out.println();
        
        print2(5, 6, 4);
    }
}

// Task 2
public class HelloWorld{
    
    public static void print()
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("5 ");
            }
            System.out.println();
        }
    }
    
    public static void main(String []args){
        
        print();
        
    }
}