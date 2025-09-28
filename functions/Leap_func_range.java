import java.util.Scanner;


public class Leap_func_range {
    public  static  boolean leap(int year){

        if(year%4==0 &&(year%100!=0 || year%400==0)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year:");
        int num= sc.nextInt();
        for(int i=1;i<=num;i++){
            boolean isLeap = leap(i);
           if(isLeap){
            System.out.println(i);
           }
        }
        
    }

    
}
