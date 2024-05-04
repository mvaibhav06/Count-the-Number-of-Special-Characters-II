import java.util.HashSet;
import java.util.Set;

public class SpecialChars {
    public static int numberOfSpecialChars(String word) {
        Set<Character> temp = new HashSet<>();
        Set<Character> out = new HashSet<>();
        int count = 0;

        for(int i=0; i<word.length(); i++){
            String s = word.charAt(i) + "";
            String s1 = s.toLowerCase();
            if(s.equals(s1)){
                if(out.contains(s.charAt(0))){
                    out.remove(s.charAt(0));
                    count--;
                }
                temp.add(s.charAt(0));
            }else{
                if(temp.contains(s1.charAt(0)) && !temp.contains(s.charAt(0))){
                    out.add(s1.charAt(0));
                    count++;
                }
                temp.add(s.charAt(0));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("AbBCab"));
    }
}
