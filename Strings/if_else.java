

public class if_else {
    public static void main(String[] args) {

         int count=0;
         int count1 =0;
         int count2 =0;
         int count3 =0;
        String s="Bright path@123";
        for(int i=0;i<s.length();i++){
            //  for(char ch ='A';ch<='z';ch++){

                 if(s.charAt(i) ==  'a'){
                //    System.out.println(ch);
                   count++;      
            }else if (s.charAt(i)==1 || s.charAt(i)==2 ||s.charAt(i)==3) {
               count1++;
            }else if(s.charAt(i)==64){
                   count2++;
            }else{
                count3++;
            }
               
            
        } 
                    
        // }
        
    
    System.out.println("total alphabets:"+count);
    System.out.println("total digits:"+count1);
    System.out.println("total sym:"+count2);
    System.out.println("total spaces:"+count3);
    
    }
}
