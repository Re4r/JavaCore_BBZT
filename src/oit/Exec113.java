package oit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exec113 {
    public static void main(String[] args) {

        Set<String> stringSet = new TreeSet<>();

        try (Scanner scanner = new Scanner(new FileReader("dest2.txt"))) {

//            scanner.useDelimiter(" ");
            while (scanner.hasNext()) {
                stringSet.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(stringSet);


    }
}
