public class Size_of_String {
    public static void main(String[] args) {
        int count=0;
        String s="Bright path@123";
        for(int i=0;i<s.length();i++){
            // System.out.println(s.charAt(i));
            if(s.charAt(i) ==  ' '){
               count ++;
               

            }
            
        }
         System.out.println(count);
    }
    
}
