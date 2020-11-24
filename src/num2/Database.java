package num2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database {
    private Connection connection;

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bitlab?useUnicode=true&serverTimezone=UTC","root", ""
            );
            System.out.println("CONNECTED");
        }catch (Exception e){
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
            PreparedStatement st = connection.prepareStatement("INSERT INTO cars(nick_name, password, salary) values(NULL,?,?,?)");
            st.setString(1,user.nickName);
            st.setString(2,user.password);
            st.setDouble(3,user.salary);

            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

