import java.util.*;
public class sum_natural_num{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int n = sc.nextInt();
          int sum=0;
          int i=1;
          while(i<=n)
          {
               sum = sum + i;
               i++;
          }
          System.out.println("sum is :" + sum);
     }
}