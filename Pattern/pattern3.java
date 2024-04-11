
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class pattern3 {
     public static void main(String[] args) {
          int n=5;
          for(int line=1; line<=n; line++)
          {
               for(int number=1; number<=line; number++)
               {
                    System.out.print(number +" ");
               }
               System.out.println();
          }
     }
}
