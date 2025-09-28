public class characters_count {

    public static void main(String[] args) {
        String s = "Bright path";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (str.indexOf(ch)  != -1) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }

            str  = str + ch;
            System.out.println( ch + ":" + count );
            
        }
    }
}
