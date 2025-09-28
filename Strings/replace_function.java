import java.util.Scanner;

public class replace_function {

    public static String replace_fun(String s,char oldchar,char newchar){

            String s1 =" ";
            
            for(char i=0;i<s.length();i++){
              if(s.charAt(i)==oldchar){
                s1 = s1 + newchar;
              }else{
                s1 = s1+s.charAt(i);
              }

                

                
            }






        return s1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = sc.next();
        String s = replace_fun(s1,'a','v');
        System.out.println(s);

        
    }
    
}
