package home5;

import home4.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("PRESS 1 TO CREATE GAME");
            System.out.println("PRESS 2 TO ADD PLAYER TO GAME");
            System.out.println("PRESS 3 TO PLAY GAME");
            System.out.println("PRESS 0 TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("    Game name:");
                String name = in.next();
                System.out.println("    IP address:");
                String IP =in.next();
                System.out.println("    PORT:");
                int PORT = in.nextInt();
                Game game = new Game(name,IP,PORT);
                games.add(game);
                saveGames(games);
            }else if(choice==2){
                System.out.println("Nickname:");
                String nick = in.next();
                System.out.println("Rating:");
                double rate = in.nextDouble();
                Players player = new Players(nick,rate);
                new Game().addPlayer(player);
            }else if(choice==3){
                System.out.println(readGames());
            }else {
                break;
            }
        }

    }
    public void saveGame(Game game){

    }
    void addPlayers(Players player){

    }

    public static void saveGames(ArrayList<Game> games){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            outStream.writeObject(games);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Game> readGames(){
        ArrayList<Game> games = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.data"));
            games = (ArrayList<Game>)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){

        }
        return games;
    }
}
