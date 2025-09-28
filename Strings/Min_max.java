public class Min_max {

    public static void main(String[] args) {
        String s ="Brightpath";
        int max =Integer.MIN_VALUE; 
        int secmax = Integer.MIN_VALUE;//65;
         

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>max){
                secmax = max;
                max = s.charAt(i);
            }else if(s.charAt(i)>secmax && max>s.charAt(i)){
                secmax = max;
            }
        
           

        }
        System.out.println((char)secmax);
    }
    
}
