package AdventureGame;

import java.util.Scanner;

public abstract class Location {

    Scanner input = new Scanner(System.in);

    private Player player;

    public Location(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void enterLocation(){}
}
