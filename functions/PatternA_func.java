import java.util.Scanner;

public class PatternA_func {
    public static  int  PatternA(int num){
        int mid=(num/2)+1;
        int k = 1,l=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                        if((j== mid && i==1 )  ){   
                        
                        System.out.print("*");
                    }else if(j==(mid - (k)) && i!=1){
                        System.out.print("*");
                        k++;
                    }
                    else if(j==(mid +l ) && i!=1){
                        System.out.print("*");
                        
                    } else if(j!=1 && j != num && i==mid-1){
                        System.out.print("*");
                        
                    }
                    else{
                        System.out.print(" ");
                    }

            }
            
            l++;

            System.out.println(" ");

        }
        return  num;
    }
        public static void main(String[] args){
            Scanner sc  = new Scanner(System.in);
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            int patternA = PatternA(num);
            System.out.println(patternA);

        }


    }
    



