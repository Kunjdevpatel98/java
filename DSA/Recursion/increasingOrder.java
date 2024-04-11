import java.util.*;
public class increasingOrder
{
     public static void numIncrease(int n)
     {
          if(n == 10)
          {
               System.out.println(n);
               return;
          }
          System.out.print(n+" ");
          numIncrease(n+1);
     }
     public static void main(String args[])
     {
          int n = 1;
          numIncrease(n);
     }
}