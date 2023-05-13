package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exec1012 {
    public static void main(String[] args) {

        String s = "ABCDABCFA4357B1CGABCRABCDABCD83484JAERTY89054321QWERTYZVXBC"
                + "AJKDSBDHBH435GHJBJHVDGVSG0004HJGYUGYUVJHDVH465877HFBCV32872";

        Pattern pattern = Pattern.compile("ABC[D|F]");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group() + " : " + matcher.start());
        }
    }
}
