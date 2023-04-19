package generic;

public class Exec {
    public static void main(String[] args) {

        Box<Paper> paperBox = new Box<>(new Paper());
        Box<Plastic> plasticBox = new Box<>(new Plastic());
        Box<Glass> glassBox = new Box<>(new Glass());

        TwoCellsBox<Paper, Plastic> paperPlasticTwoCellsBox;
        paperPlasticTwoCellsBox = new TwoCellsBox<>(new Paper(),new Plastic());
        TwoCellsBox<Plastic, Glass> plasticGlassTwoCellsBox;
        plasticGlassTwoCellsBox = new TwoCellsBox<>(new Plastic(), new Glass());

    }
}

class Paper {}
class Plastic {}
class Glass {}
