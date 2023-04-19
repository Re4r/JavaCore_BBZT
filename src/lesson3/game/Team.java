package lesson3.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participants> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void newAddPlayer(Participants p) {
        participants.add(p);
        System.out.println("Team: " + name + " New Player: " + p.getName());
    }

    public void playWith(Team team) {
        String winner;
        Random random = new Random();
        int x = random.nextInt(2);
        if (x == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }
        System.out.println("Team: " + winner + " Win");
    }
}
