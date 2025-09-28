

public class interchange_string{



     public static void main(String[] args) {

        String s="Ankita Sujata Ramesh Ramchandra Chavan ".trim();
         String s1 =" ";
        
         int end = s.length();
        //  int space =0;
        //  int start =0;

        
         for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
              
                s1 =  s1 + s.substring(i+1,end)+" ";
                end = i;
                
            }else if(i==0){
                s1 = s1 + s.substring(i,end) ;
            }

           
         }
      System.out.println(s1.trim());
        
            
        }
       
}
    
    

