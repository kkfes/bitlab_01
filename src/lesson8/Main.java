package lesson8;

import lesson8.Database;
import lesson8.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Database db = Database.getDb();
        db.connect();
        db.addUser(new User(2,"Askar","qwerty",10000));
    }
}
