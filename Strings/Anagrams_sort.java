public class Anagrams_sort {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 ="listen";

        s1 =s1.toLowerCase();
        s2 =s2.toLowerCase();
       

        // String str =" ";
        boolean flag = true;

        if(s1.length()!=s2.length()){
            System.out.println("String is not anagram");
            
         }else{
        for(int i=0;i<s1.length();i++){
             int count =0;
            int count1=0;
            char ch = s1.charAt(i);
            // if(str.indexOf(ch)!=-1){
            //     continue;
            // }

            for(int j=0;j<s1.length();j++){

                if(s1.charAt(j)==ch){
                         count++;
                }
                
            }
          
            for(int k=0;k<s2.length();k++){
                if( ch == s2.charAt(k)){
                    count1++;
                }
               
            }
            if(count!=count1){
                flag = false;
                System.out.println("String is not the anagram");
                 break; 
        }

            }
            if(flag == true){
                System.out.println("String is anagram");
            }
           
        
          

        }
        
    }
}
