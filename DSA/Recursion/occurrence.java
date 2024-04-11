public class occurrence
{
     public static int firstOccurrence(int arr[], int key, int i)
     {
          if(i == arr.length)
          {
               return -1;
          }
          if(arr[i] == key)
          {
               return i;
          }
          return firstOccurrence(arr, key, i+1);
     }
     public static void main(String args[])
     {
          int arr[] = {2,4,3,5,7,1,9,5,6};
          System.out.print(firstOccurrence(arr, 5, 0));
     }
}