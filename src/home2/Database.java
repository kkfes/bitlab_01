package home2;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    private static lesson8.Database db = new lesson8.Database();
    private Connection connection;

    public static lesson8.Database getDb(){
        return db;
    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bitlab_1?useUnicode=true&serverTimezone=UTC", "root", ""
            );
            System.out.println("CONNECTED");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
