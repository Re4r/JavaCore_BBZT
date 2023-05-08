package multithreading;

import java.util.List;
import java.util.concurrent.Exchanger;

public class Exec820 {
    public static void main(String[] args) {

    }
}

enum Action {
    STONE,
    SCISSORS,
    PAPPER
}

class Playser {
    private Exchanger<Action> actionExchanger;
    private List<Action> actionList;

    public Playser(Exchanger<Action> actionExchanger, List<Action> actionList) {
        this.actionExchanger = actionExchanger;
        this.actionList = actionList;
    }
}
