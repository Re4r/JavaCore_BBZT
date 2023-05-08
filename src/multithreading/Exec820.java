package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Exec820 {
    public static void main(String[] args) {

        Exchanger<Action> actionExchanger = new Exchanger<>();

        List<Action> actionList1 = new ArrayList<>();

        actionList1.add(Action.STONE);
        actionList1.add(Action.PAPPER);
        actionList1.add(Action.SCISSORS);

        List<Action> actionList2 = new ArrayList<>();

        actionList2.add(Action.PAPPER);
        actionList2.add(Action.SCISSORS);
        actionList2.add(Action.STONE);


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

    private void whoWins(Action action, Action reply) {
        if ((action == Action.STONE && reply == Action.SCISSORS)
                || (action == Action.SCISSORS && reply == Action.PAPPER)
                || (action == Action.PAPPER && reply == Action.STONE)) {

            System.out.println(Thread.currentThread().getName() + " > WINS!!!");
        } else {
            System.out.println("NOBODY WINS...");
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
