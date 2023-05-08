package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Exec820 {
    public static void main(String[] args) {

        Exchanger<Action> actionExchanger = new Exchanger<>();

        List<Action> actionList1 = new ArrayList<>();

        actionList1.add(Action.SCISSORS);
        actionList1.add(Action.PAPER);
        actionList1.add(Action.SCISSORS);

        List<Action> actionList2 = new ArrayList<>();

        actionList2.add(Action.PAPER);
        actionList2.add(Action.SCISSORS);
        actionList2.add(Action.STONE);

        new Player(actionExchanger, actionList1).setName("first_player");
        new Player(actionExchanger, actionList2).setName("second_player");




    }
}

enum Action {
    STONE,
    SCISSORS,
    PAPER
}

class Player extends Thread {
    private final Exchanger<Action> actionExchanger;
    private final List<Action> actionList;

    public Player(Exchanger<Action> actionExchanger, List<Action> actionList) {
        this.actionExchanger = actionExchanger;
        this.actionList = actionList;
        this.start();
    }

    private void whoWins(Action action, Action reply) {

        if ((action == Action.STONE && reply == Action.SCISSORS)
                || (action == Action.SCISSORS && reply == Action.PAPER)
                || (action == Action.PAPER && reply == Action.STONE)) {

            System.out.println(Thread.currentThread().getName() + " > WINS!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : actionList) {
            try {
                reply = actionExchanger.exchange(action);
                whoWins(action, reply);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
