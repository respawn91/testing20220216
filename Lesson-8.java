// Exceptions

public class HelloWorld{

    public static void main(String []args){
        
        int a = 10;
        int b = 0;
        
        int c = a / b;
        
        System.out.println(c);
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        int a = 10;
        int b = 5;
        
        try
        {
            int c = a / b;
            System.out.println(c);
        }
        
        catch(Exception e)
        {
            System.out.println("It is impossible to divide by zero, Comrade!");
        }
        
        finally
        {
            System.out.println("Finally...");
        }
        
        System.out.println("THE END");
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        int a = 10;
        int b = 0;
        
        try
        {
            int c = a / b;
            System.out.println(c);
        }
        
        catch(Exception e)
        {
            System.out.println("It is impossible to divide by zero, Comrade!");
        }
        
        System.out.println("THE END");
    }
}


public class HelloWorld{
    
    public static int division(int a, int b)
    {
        return a / b;
    }
    
    public static void main(String []args){

        int a = 10;
        int b = 0;
        
        try
        {
            int c = division(a,b);
            System.out.println(c);
        }
        
        catch(ArithmeticException ex)
        {
            System.out.println("It is impossible to divide by zero, Comrade!");
            ex.printStackTrace();
        }
        
        catch(Exception e)
        {
            System.out.println("Something is going wrong...");
            e.printStackTrace();
        }

        
        System.out.println("THE END");
    }
}

// Project 1 - https://codeboard.io/projects/317524
// Project 2 - https://codeboard.io/projects/295066