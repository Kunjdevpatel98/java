import java.util.*;
public class bubble
{
     public static void bubbleSort(int arr[])
     {
          for(int term=0; term<arr.length-1; term++)
          {
               for(int j=0; j<arr.length-1-term; j++)
               {
                    if(arr[j] > arr[j+1])
                    {
                         int temp = arr[j];
                         arr[j] = arr[j+1];
                         arr[j+1] = temp; 
                    }
               }
          }
     }
     public static void printArr(int arr[])
     {
          for(int i=0; i<arr.length; i++)
          {
               System.out.print(arr[i]+" ");
          }
          System.out.println();
     }
     public static void main(String args[])
     {
          int arr[]={2,4,1,5,3};
          bubbleSort(arr);
          printArr(arr);
     }
}