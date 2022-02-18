public class HelloWorld{

     public static void main(String []args){
         
        byte x = 10;
        // тип_данных название_переменной = значение
        
        System.out.println(x);
     }
}

public class HelloWorld{

     public static void main(String []args){
         
        int x = 128;
        System.out.println(x);
        
        double y = 128;
        System.out.println(y);
        
        String z = "Welcome!";
        System.out.println(z);
        
        boolean b = true;
        System.out.println(b);
     }
}

// Task 1
public class HelloWorld{

     public static void main(String []args){
         
        int days = 234;
        
        int weeks = days / 7;
        
        System.out.println("Weeks = " + weeks);
       
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int x1 = 10;
        int y1 = 3;
        
        System.out.println(x1/y1);
        
        double x2 = 10;
        double y2 = 3;
        
        System.out.println(x2/y2);
        
        int x3 = 10;
        double y3 = 3;
        
        System.out.println(x3/y3);
        
     }
}

// Task 2
public class HelloWorld{

     public static void main(String []args){
        
        int number = 39;
        
        int d = number / 10;
        int e = number % 10;
        int s = d + e;
        int p = d * e;
        
        System.out.println(d);
        System.out.println(e);
        System.out.println(s);
        System.out.println(p);
        
     }
}

// Task 3

public class HelloWorld{

     public static void main(String []args){
        
        double r = 10;
        
        double c = 2 * Math.PI * r;
        
        System.out.println(c);
        
     }
}

// Task 5
public class HelloWorld{

     public static void main(String []args){
        
        int number = 158;
        
        int s = number / 100;
        int d = number % 100 / 10;
        int e = number % 10;
        
        System.out.println("S = " + s);
        System.out.println("D = " + d);
        System.out.println("E = " + e);
        
        System.out.println("Sum = " + (s + d + e));
        System.out.println("Multi = " + (s * d * e));
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int x = 30;
        int y = 20;
        
        boolean b = x > y;
        
        System.out.println(b);
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int x = 30;
        int y = 20;
        int z = 10;
        
        // true
        boolean b1 = (x > y) && (x > z);
        System.out.println(b1);
        // false
        boolean b2 = (x > y) && (z > y);
        System.out.println(b2);
        // true
        boolean b3 = (x > y) || (z > y);
        System.out.println(b3);
        // false
        boolean b4 = (y > x) || (z > y);
        System.out.println(b4);
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int x = 20;
        int y = 20;
        
        boolean b = (x == y);
        
        System.out.println(b);
        
     }
}

// Task 6
public class HelloWorld{

     public static void main(String []args){
        
        double Skv = 100;
        double Skr = 1000;
        
        double a = Math.sqrt(Skv);
        double r = Math.sqrt(Skr/Math.PI);
        
        boolean b1 = (r <= a/2);
        
        boolean b2 = (a <= r*Math.sqrt(2));
        
        System.out.println("Does it possible to fit the circle to square?");
        System.out.println(b1);
        
        System.out.println("Does it possible to fit the square to circle?");
        System.out.println(b2);
     }
}