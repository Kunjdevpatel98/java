public class pattern
{
//---------------------------------(1)-------------------------------------
    public static void NumberIncreasing(int number)
     {
          for(int line=1; line<=number; line++)
          {
               for(int start=1; start<=line; start++)
               {
                    System.out.print(start +" ");
               }
               System.out.println();
          }
     }
//--------------------------------(2)--------------------------------------
     public static void NumberIncreasingReverse(int number)
     {
           for(int line=1; line<=number; line++)
          {
               for(int start=1; start<=number-line+1; start++)
               {
                    System.out.print(start +" ");
               }
               System.out.println();
          }
     }
//---------------------------------(3)-------------------------------------
     public static void NumberChinging(int number)
     {
          int num=1;
          for(int line=1; line<=number; line++)
          {
               for(int start=1; start<=line; start++)
               {
                    System.out.print(num +" ");
                    num++;
               }
               System.out.println();
          }
     }
//--------------------------------(4)--------------------------------------
     public static void ZeroOneTriangle(int number)
     {
          for(int line=1; line<=number; line++)
          {
               for(int start=1; start<=line; start++)
               {
                    if((line + start) % 2 == 0)
                    {
                         System.out.print(1 + " ");
                    }
                    else
                    {
                         System.out.print(0 + " ");
                    }
               }
               System.out.println();
          }
     }
//----------------------------------(5)-------------------------------------
     public static void NumberTriangle(int n)
     {
          for(int i=1; i<=n; i++)
          {
               for(int j=1; j<=n-i; j++)
               {
                    System.out.print(" ");
               }
               for(int j=1; j<=i; j++)
               {
                    System.out.print(i +" ");
               }
               System.out.println();
          }
     }
//-----------------------------------(6)------------------------------------
     public static void PalindromeTriangle(int n)
     {
          for(int i=1; i<=n; i++)
          {
               for(int j=1; j<=2*(n-i); j++)
               {
                    System.out.print(" ");
               }
               for(int j=i; j>=1; j--)
               {
                    System.out.print(j +" ");
               }
               for(int j=2; j<=i; j++)
               {
                    System.out.print(j +" ");
               }
               System.out.println();
          }
     } 
//----------------------------------(7)-------------------------------------
     public static void SqureHollow(int n)
     {
          for(int i=0; i<n; i++)
          {
               for(int j=0; j<n; j++)
               {
                    if(i==0 || i==n-1 || j==0 || j==n-1)
                    {
                         System.out.print("*");
                    }
                    else
                    {
                         System.out.print(" ");
                    }
               }
               System.out.println();
          }
     }
//===================M A I N--------F U N C T I O N=========================
     public static void main(String args[])
     {     
          //  1
          //  1 2
          //  1 2 3                     (1)
         // NumberIncreasing(5);

          //  1 2 3
          //  1 2
          //  1                          (2)
         // NumberIncreasingReverse(5);

          // 1
          // 2 3
          // 4 5 6                       (3)
         //NumberChinging(5);

          // 1
          // 0 1
          // 1 0 1                        (4)
         //ZeroOneTriangle(5);

           //   1
           //  2 2
           // 3 3 3                       (5)
         //NumberTriangle(5);

          //        1
          //      2 1 2
          //    3 2 1 2 3                  (6)
         //PalindromeTriangle(5);

          // ****
          // *  *
          // *  *
          // ****                           (7)
         //SqureHollow(5);
     }
}