package lesson3.game;

import java.util.ArrayList;
import java.util.List;

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
}
