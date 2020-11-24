package home5;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    String gameName;
    String ipAddress;
    int port;
    ArrayList<Players> players = new ArrayList<>();

    public Game() {
    }

    public Game(String gameName, String ipAddress, int port) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public void addPlayer(Players player){
        players.add(player);
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                ", players=" + players.toString() +
                '}';
    }
}
