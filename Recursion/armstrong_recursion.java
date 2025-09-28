import java.util.Scanner;

public class armstrong_recursion {
      public static int armstrong(int num,int sum){

         if(num == 0){
            return sum ;
        }
        
        int rem = num%10;
        int cube = rem*rem*rem;
        sum = sum + cube;
        // num = num/10;
      
        return armstrong(num/10,sum);

      

      }
      public static boolean checkArmstrong(int num,int sum){
        return num == armstrong(num, sum);

      }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
         boolean Isarmstrong = checkArmstrong(i,0);
         if(Isarmstrong){
              System.out.println(i);
         }

       

        }
  

    }

    
}
