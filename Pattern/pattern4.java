
// A 
// B C
// D E F
// G H I J
// K L M N O

public class pattern4 {
     public static void main(String[] args) {
          int n=4;
          char ch='A';
          for(int line=1; line<=n; line++)
          {
               for(int chars=1; chars<=line; chars++)
               {
                    System.out.print(ch +" ");
                    ch++;
               }
               System.out.println();
          }
     }
}
