package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exec1012 {
    public static void main(String[] args) {

        String s = "ABCDABCFABCGABCRABCDABCD";

        Pattern pattern = Pattern.compile("ABC");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
