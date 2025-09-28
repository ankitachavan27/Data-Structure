import java.util.Scanner;

public class automorphic_recursion {
    public static boolean automorphic(int num,int square){
        if(num == 0){
            return true;
        }
        
        int lastdigit = num%10;
        int squarelastdigit =square%10;
        if(lastdigit!=squarelastdigit){
            return false;
        }
        return automorphic(num/10, square/10) ;
    }
   
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean isAutomorhic = automorphic(i,i*i);
            if(isAutomorhic){
                System.out.println(i);
            }
        }
    }
}
