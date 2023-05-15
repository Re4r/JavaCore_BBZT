package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exec1012 {
    public static void main(String[] args) {

        String s = "ABCDAB^&*$CFA4357B1CGABCRABCDA!BCD834&*%$84JAERTY89054321QWERTYZVXBC"
                + "AJKDSBDHBH435GHJBJH===VDGVSG0004HJGYUGYUVJ@@@@HDVH465877HFBCV32872";

        Pattern pattern = Pattern.compile("\\W{3}");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group() + " : " + matcher.start());
        }
    }
}
