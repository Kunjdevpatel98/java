public class factorial
{
     public static int factorial(int n)
     {
          int f=1;
          for(int i=1; i<=n; i++)
          {
               f = f * i;
          }
          return f;
     }
     public static void main(String args[])
     {
          int fact = factorial(5);
          System.out.print("Factorial is "+ fact);
     }
}