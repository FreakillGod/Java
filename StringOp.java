import java.util.HashSet;
import java.util.Map;

public class StringOp {

    public static void reversString(String st) {
        String rev = "";

        for (int i = 0; i < st.length(); i++) {
            rev = st.charAt(i) + rev;
        }

        System.out.println(rev);
    }

    public static boolean isPalindrom(String st, int r, int l) {
        if (l >= r) {
            System.out.println("true");
            return true;
        }
        if (st.charAt(r) != st.charAt(l)) {
            System.out.println("false");
            return false;
        }
        return isPalindrom(st, r + 1, l - 1);
    }

    public static void duplicateCharacters(String st) {

        // Map<

        for (int i = 0; i < st.length(); i++) {

        }
    }

    public static void areRotations(String s1, String s2) {
        if (s1.length() == s2.length() && (s1 + s1).indexOf(s2) != -1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    // print the powerset of the give string
    //abc=> abc ac bc ab a b c...
    public static void powerSetOfString(String st, int i, String curr) {

        if (i == st.length()) {
            System.out.println(curr);
            return;
        }
        powerSetOfString(st, i + 1, curr + st.charAt(i));
        powerSetOfString(st, i + 1, curr);
    }

    //______________________________________________-need- attenstion______________________________________________

    // print all the permutaion of the given string
    // for abc=> bac, bca, acb, cab...
    public static void permutaionOfString(String st, int l, int r) {
        if (l == r) {
            System.out.println(st);
            return;
        }
        for (int i = l; i <= r; i++) {
            st = swap(st, l, i);
            permutaionOfString(st, l + 1, r);
            st = swap(st, l, i);
        }
    }

    public static String swap(String st, int l, int r) {
        char[] str = st.toCharArray();
        char temp = str[r];
        str[r] = str[l];
        str[r] = temp;
        return new String(str);
    }

    // longest palindromic subsequence
    public static void lPSequence(String st) {
        int maxCount = 0;
        int count = 0;
        String res = "";

        int l = 0, r = 0;

        for (int i = 0; i < st.length(); i++) {
            while (l >= 0 && r < st.length() && st.charAt(l) == st.charAt(r)) {
                if (maxCount < count) {
                    while (l < r) {
                        res += st.charAt(l);
                        l++;
                    }
                    maxCount = count;
                }
            }
        }

        System.out.println(res);

    }

    public static void main(String[] args) {

        String st = "Heelo I am Vikash";
        String pst = "abcdba";
        String lcp = "kitis";

        // reversString(st);
        // isPalindrom(pst, 0, pst.length() - 1);
        // duplicateCharacters(st);

        // lPSequence(lcp);
        // areRotations("abcd","cdab");
        powerSetOfString("abc", 0, "");

    }
}
