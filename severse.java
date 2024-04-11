// import java.util.*;

public class severse {
     public static void main(String[] args) {
          // Scanner sc = new Scanner(System.in);
          // System.out.println("Enter the number:");
          // int num = sc.nextInt();
          int num=12345;
          while (num>0) {
               int lastdigit=num%10;
               System.out.print(lastdigit);
               num++;
               num=num/10;
          }
     
     }
}
