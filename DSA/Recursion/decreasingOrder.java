import java.util.*;
public class decreasingOrder
{
     public static void numDecrease(int n)
     {
          if(n == 1)
          {
               System.out.println(n);
               return;
          }
          System.out.print(n+" ");
          numDecrease(n-1);
     }
     public static void main(String args[])
     {
          int n = 10;
          numDecrease(n);
     }
}