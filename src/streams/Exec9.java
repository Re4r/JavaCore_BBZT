package streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.awt.PageAttributes.MediaType.D;

public class Exec9 {
    public static void main(String[] args) {

        String source = """
                Noi Echor
                Myrin Lan
                Steinfinnur Melui
                Connak Sedryn
                Connak Sedryn
                Viserra Vorn
                Morthil Daedeloth
                Haugin Glad
                Meera Andrath
                Skirfar Melui
                Aidura Edhil
                Gimona Morthil
                Folduin Sirion
                Dondna Morthil
                Servin Galadhon
                Toraldur Galadhon
                Dilura Ninglor
                Gargrom Gaurhoth
                Aelene Dungortheb
                Galren Gorgor
                Rikkin Elleth
                Hloin Ningloron
                Meara Guinar
                Erlathan Celerdain
                Sorkvi Aderthad
                """;

        try {
            FileWriter fileWriter = new FileWriter("D:\\lessonZT\\test.txt");

            for (int i = 0; i < source.length() ; i++) {
                fileWriter.write(source.charAt(i));
            }

            System.out.println("DONE");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
