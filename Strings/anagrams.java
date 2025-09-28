import java.util.Scanner;



public class anagrams {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first string:");
        String s1 = sc.nextLine();
        System.out.println("enter the second string");
        String s2 = sc.nextLine();
         s1 =s1.toLowerCase();
        s2 =s2.toLowerCase();
        int arr1[] = new int[65535];
        boolean flag =true;
        if(s1.length()!=s2.length()){
         System.out.println("String is not anagram");
        }else{
        
      for(int i=0;i<s1.length();i++){
         int ch = (int)s1.charAt(i);
         arr1[65535-ch] = arr1[65535-ch]+1;
      }
      for(int j=0;j<s2.length();j++){
          int ch = (int)s2.charAt(j);
         arr1[65535-ch] = arr1[65535-ch]-1;

      }
      for(int i =0;i<arr1.length;i++){
         if(arr1[i]!=0){
            flag = false;
            System.out.println("Not an anagram");
            break;
         }
      }
      if(flag == true){
         System.out.println("It is an anagram");
      }

   }
  
    
}
}
