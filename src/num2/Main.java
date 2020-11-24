package num2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        Database db = new Database();
        db.connect();


        users = db.getAllUsers();

        for (User u:users){
            System.out.println(u);
        }
    }
}
