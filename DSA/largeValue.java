import java.util.*;

public class largeValue
{
     public static int getLargest(int number[])
     {
          int largest = Integer.MIN_VALUE; // -infinite
          int smallest = Integer.MAX_VALUE; //+infinite

          for(int i=0; i<number.length; i++)
          {
               if(largest < number[i])
               {
                    largest = number[i];
               }
               if(smallest > number[i])
               {
                    smallest = number[i];
               }
          }
          System.out.println("Largerst value is "+ smallest);
          return largest;
     }
     public static void main(String args[])
     {
          int number[] = {2,3,7,5,4,8,1,6};
          System.out.println("Largerst value is "+ getLargest(number));
     }
}