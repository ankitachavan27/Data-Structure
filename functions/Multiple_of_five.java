import java.util.Scanner;

public class Multiple_of_five {
    
    public static boolean isMultiple(int num) {
        if(num%5==0){
            return true;
        }
        else{
            return false;
        }
    
    

    }
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        boolean  Multiple = isMultiple(num);
        System.out.println(Multiple);

    }
}
