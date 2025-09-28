public class String_first{
    public static void main(String args[]){
        String s1 = new String ("Bright path");
         String s2 = new String ("Bright path");
         String s3 = "Bright path";
         String s4 = "Bright path";
         String s5 ="Bright" + " path";
         String s6 ="Bright";

         System.out.println(s1==s2);
         System.out.println(s3==s4);
         System.out.println(s1==s5);
         System.out.println(s4==s5);


    }
}