import java.util.Scanner;

public class substring_function {

    public static String subString_func(String s,int begin ,int end){
        
         String s1 =" ";

         for(int i=begin;i<end;i++){
            s1 = s1+ s.charAt(i);
         }
    return s1;

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = sc.next();
        String s = subString_func(s1,2,5);
        System.out.println(s);



        
    }
    
}
