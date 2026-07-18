//Reverse words in a string
/*public class lec51 {
    static String revWordString(String original) {
        StringBuilder ans = new StringBuilder();
        int i = original.length() - 1;
        while (i >= 0) {
            // skip trailing spaces
            while (i >= 0 && original.charAt(i) == ' ') {
                i--;
            }
            if (i < 0)
                break;

            // find start of word
            int j = i;
            while (j >= 0 && original.charAt(j) != ' ') {
                j--;
            }
            ans.append(original.substring(j + 1, i + 1));
            if (j >= 0) {
                ans.append(' ');
            }
            i = j;
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String original = "Hello World , I'm learning DSA";
        String finalAns = revWordString(original);
        System.out.println(finalAns);
    }
}*/

// Most frequent char
import java.util.HashMap;

public class lec51 {
    static char maxFreq(String a) {
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            freq[currentChar - 'a']++;
        }
        int maxFreq = -1;
        char ans = 'a';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String a = "leetcode";
        char finalAns = maxFreq(a);
        System.out.println(finalAns);
    }
}
