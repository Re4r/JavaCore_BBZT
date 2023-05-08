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

class Playser extends Thread {
    private Exchanger<Action> actionExchanger;
    private List<Action> actionList;

    public Playser(Exchanger<Action> actionExchanger, List<Action> actionList) {
        this.actionExchanger = actionExchanger;
        this.actionList = actionList;
    }

    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.STONE && friendAction == Action.SCISSORS)
                || (myAction == Action.SCISSORS && friendAction == Action.PAPPER)
                || (myAction == Action.PAPPER && friendAction == Action.STONE)) {
            System.out.println(Thread.currentThread().getName() + " > WINS");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : actionList) {
            try {
                reply = actionExchanger.exchange(action);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
