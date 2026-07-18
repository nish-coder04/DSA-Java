//Remove All occurence of a string
/*public class lec52 {
    static String removeOcc(String s, String part) {
        while (s.contains(part)) {
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index + part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "ababxabyzab";
        String part = "ab";
        String finalAns = removeOcc(s, part);
        System.out.println(finalAns);
    }
}*/

//Permutation in String
public class lec52 {

    static boolean compareFreq(int[] count2, int[] count3) {
        for (int i = 0; i < 26; i++) {
            if (count2[i] != count3[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean permutationExist(String s, String part) {

        if (s.length() < part.length()) {
            return false;
        }

        // Frequency of part
        int[] count2 = new int[26];
        for (int i = 0; i < part.length(); i++) {
            char ch = part.charAt(i);
            count2[ch - 'a']++;
        }

        int windowLen = part.length();

        // Frequency of first window in s
        int[] count3 = new int[26];
        for (int i = 0; i < windowLen; i++) {
            char ch = s.charAt(i);
            count3[ch - 'a']++;
        }

        // Compare first window
        if (compareFreq(count2, count3)) {
            return true;
        }

        // Sliding Window
        int i = 0;

        while (i + windowLen < s.length()) {

            // Add new character
            char newChar = s.charAt(i + windowLen);
            count3[newChar - 'a']++;

            // Remove old character
            char oldChar = s.charAt(i);
            count3[oldChar - 'a']--;

            i++;

            // Compare frequencies
            if (compareFreq(count2, count3)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String s = "eidbaooo";
        String part = "ab";

        boolean answer = permutationExist(s, part);
        System.out.println(answer);
    }
}