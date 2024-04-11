public class sumOfNatural
{
     public static int naturalNum(int n)
     {
          if(n == 1)
          {
               return 1;
          }
          int Snm1 = naturalNum(n-1);
          int Sn = n + Snm1;
          return Sn;
     }
     public static void main(String args[])
     {
          int n = 5;
          System.out.print(naturalNum(n));
     }
}