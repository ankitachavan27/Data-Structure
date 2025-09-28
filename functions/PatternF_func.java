import java.util.Scanner;

public class PatternF_func {
    
    public static  int  PatternF(int num){
        int mid=(num/2)+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                        if((j==1 || i==1 || i==mid   )  ){   
                                       System.out.print("*");
                        }
                    else{
                        System.out.print(" ");
                    }
            }
            System.out.println(" ");
        }
        return  num;
    }
        public static void main(String[] args){
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            int patternE = PatternF(num);
            System.out.println(patternE);

        }


    }
    



