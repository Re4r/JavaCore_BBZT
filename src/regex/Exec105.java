package regex;

public class Exec105 {
    public static void main(String[] args) {

        String s1 = "AAZAAZAZAZAZAZAZAZAZAB";
        String s2 = s1.replace("ZAB", "SQL");
        System.out.println(s2);
        String s3 = s2.replaceAll("A{2}", "PEEP");
        System.out.println(s3);



    }
}
