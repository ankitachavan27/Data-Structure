public class digits {
    
    public static void main(String[] args) {
        int count=0;
        String s="Bright path@123";
        for(int i=0;i<s.length();i++){
            for(int j=48;j<= 59;j++){

                 if(s.charAt(i) ==  j){
                //    System.out.println(ch);
                   count++;
              
            }
               
            
        }
        
    
}
 System.out.println(count); 
}
    
}
