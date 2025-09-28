import java.util.Scanner;


public class Perfect_func_range{
    public  static  boolean perfect(int no){
        int i =1;
        int sum =0;

        int num;
        num =no;
        
        while(i<no){

            if(no%i==0){
                sum = sum+i;
            }
            i++;
        }
        if(num ==sum){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean isPerfect = perfect(i);
            if(isPerfect){
                System.out.println(i);
            }
            
        }
       
    }

    
}
