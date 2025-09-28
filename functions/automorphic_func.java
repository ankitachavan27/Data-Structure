import java.util.Scanner;

public class automorphic_func {

    public static boolean automorphic( int num){
      int square = num*num;
      while(num>0){
        int lastdigit = num%10;
        int squarelastdigit = square%10;
        if(lastdigit!=squarelastdigit){
          return false;
        }
        num = num/10;
        square = square/10;
      }
        
      return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter te number");
        int num = sc.nextInt();
        boolean automorphic1= automorphic(num);
        System.out.println(automorphic1);


        
    }
    
}
