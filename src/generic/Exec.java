package generic;

import java.util.ArrayList;
import java.util.List;

public class Exec {
    public static void main(String[] args) {

        Box<Paper> paperBox = new Box<>(new Paper());
        Box<Paper> plasticBox = new Box<Paper>(new Plastic());
        Box<Paper> glassBox = new Box<Paper>(new Glass());

        List<Box> list = new ArrayList<>();

        list.add(paperBox);
        list.add(plasticBox);
        list.add(glassBox);

        for (Box box : list) {
            System.out.println(box);
        }

        TwoCellsBox<Paper, Plastic> paperPlasticTwoCellsBox;
        paperPlasticTwoCellsBox = new TwoCellsBox<>(new Paper(), new Plastic());
        TwoCellsBox<Plastic, Glass> plasticGlassTwoCellsBox;
        plasticGlassTwoCellsBox = new TwoCellsBox<>(new Plastic(), new Glass());

        System.out.println(paperBox.getItemWeight());
        System.out.println(plasticBox.getItemWeight());
        System.out.println(glassBox.getItemWeight());

    }
}

class Paper extends Garbage {

    @Override
    public double getWeight() {
        return 1.1;
    }
}

class Plastic extends Garbage {
    @Override
    public double getWeight() {
        return 2.4;
    }
}

class Glass extends Garbage {
    @Override
    public double getWeight() {
        return 5.7;
    }
}

