package lesson8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database {

    private static Database db = new Database();
    private Connection connection;

    public static Database getDb(){
        return db;
    }

    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bitlab_bd4?useUnicode=true&serverTimezone=UTC", "root", ""
            );
            System.out.println("CONNECTED");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<User> getAllUsers(){
        ArrayList<User> users = new ArrayList<>();

        try{
            PreparedStatement st = connection.prepareStatement("SELECT * FROM users");
            ResultSet rs = st.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String nickName = rs.getString("nick_name");
                String password = rs.getString("password");
                double salary = rs.getDouble("salary");
                users.add(new User(id,nickName,password,salary));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return users;
    }

    public void addUser(User user){
        try{
            PreparedStatement st = connection.prepareStatement("INSERT INTO users(nick_name, password, salary) values(?,?,?)");
            st.setString(1,user.getNickName());
            st.setString(2,user.getPassword());
            st.setDouble(3,user.getSalary());
            st.executeUpdate();
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void updateUser(User user, int id){
        try{
            PreparedStatement st = connection.prepareStatement("UPDATE users set nick_name = ?, password = ?, salary = ? where id = ?");

            st.setString(1, user.getNickName());
            st.setString(2, user.getPassword());
            st.setDouble(3, user.getSalary());
            st.setInt(4,id);
            st.executeUpdate();
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteUser(int id){
        try{
            PreparedStatement st = connection.prepareStatement("DELETE FROM users where id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteUser(String nickName){
        try {
            PreparedStatement st = connection.prepareStatement("DELETE FROM users where nick_name = ?");
            st.setString(1, nickName);
            st.executeUpdate();
            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
