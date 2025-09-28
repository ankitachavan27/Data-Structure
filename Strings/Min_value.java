public class Min_value {
    

    public static void main(String[] args) {
        String s ="Brightpath";
        
        int min = Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){
            if(min>s.charAt(i)){
                min = s.charAt(i);
            }
        }
        System.out.println((char)min);
    }
    
}

    

