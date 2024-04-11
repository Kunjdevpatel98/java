public class arrSortedOrNot
{
     public static boolean isSorted(int arr[], int key)
     {
          if(key == arr.length-1)
          {
               return true;
          }
          if(arr[key] > arr[key+1])
          {
               return false;
          }
          return isSorted(arr, key+1);
     }
     public static void main(String args[])
     {
          int arr[] = {1,2,3,4,5};
          System.out.print(isSorted(arr,0));
     }
}