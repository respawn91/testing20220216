// Фибоначчи

public class HelloWorld{

     public static void main(String []args){
        
        int f1 = 1;
        int f2 = 1;
        
        int n = 10;
        
        if(n > 0)
        {
            System.out.print(f1 + " " + f2 + " ");
            
            for(int i = 3; i <= n; i++)
            {
                int fk = f1 + f2;
                System.out.print(fk + " ");
                f1 = f2;
                f2 = fk;
            }
        }
     }
}

public class HelloWorld{

    public static int fibonacci(int n)
    {
        if((n == 1) || (n == 2))
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String []args){
        
        for(int i = 1; i <= 10; i++)
            System.out.print(fibonacci(i) + " ");    
    }
}

// Triangle

public class HelloWorld{

    public static boolean isTriangle(double a, double b, double c)
    {
        if((a + b > c) && (b + c > a) && (a + c > b) && (a > 0) && (b > 0) && (c > 0))
            return true;
        else
            return false;
    }

    public static double perimetr(double a, double b, double c)
    {
        if(isTriangle(a,b,c) == true)
            return a + b + c;
        else
            return 0;
    }
    
    public static double square(double a, double b, double c)
    {
        if(isTriangle(a,b,c) == true)
        {
            double p = perimetr(a,b,c) / 2;
        
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
            return s;    
        }
        else
            return 0;
    }
    
    public static void main(String []args){
    
        System.out.println(perimetr(-3,4,5));
        System.out.println(square(3,4,-5));
        System.out.println(perimetr(10,4,5));
        System.out.println(square(3,4,15));
        System.out.println(square(3,4,5));
    
    }
}