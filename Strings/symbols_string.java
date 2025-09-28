public class symbols_string {
    
    public static void main(String[] args) {
        int count=0;
        String s="Bright path@#123";
        for(int i=0;i<s.length();i++){
            for(int ch =33;ch<=64;ch++){

                 if(s.charAt(i) ==  ch){
                    System.out.println(ch);
                   count++;
              
            }

               
            
        }
        
    
}
 System.out.println(count); 
}
    
}
