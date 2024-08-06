package Strings;
import java.util.*;
public class StComp {
    public static String compression(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;  // reset count for the next character
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaaabbbbbcccc";
        System.out.println(compression(str));
    }
}
