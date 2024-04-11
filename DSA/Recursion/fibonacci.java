public class fibonacci
{
     public static int fibonacci(int n)
     {
          if(n == 0 || n == 1)
          {
               return n;
          }
          int fibnm1 = fibonacci(n-1);
          int fibnm2 = fibonacci(n-2);
          int fibn = fibnm1 + fibnm2;
          return fibn;
     }
     public static void main(String args[])
     {
          int n = 10;
          System.out.print(fibonacci(n));
     }
}