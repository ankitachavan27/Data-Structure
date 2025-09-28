

public class reverse_string {


   
public static String reverseString(String s){

    String s1 = "";

    for(int i=s.length()-1;i>=0;i--){
        s1=s1+s.charAt(i);
    }


    return s1;
}

     public static void main(String[] args) {

        String s="Ankita Sujata Ramesh Ramchandra Chavan ".trim();
         String s1 =" ";
        
         int end = s.length();
         int space =0;
         int start =0;

        
         for(int i =0;i<=end;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ' || i == end){
                space =i;
                s1 =  s1 + reverseString(s.substring(start,space))+" ";
                start = space  +1;
                
            }

           
         }
      System.out.println(s1.trim());
        
            
        }
       
}
    
    

