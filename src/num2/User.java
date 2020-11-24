package num2;

public class User {
    int id;
    String nickName;
    String password;
    double salary;

    public User() {
    }

    public User(int id, String nickName, String password, double salary) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User {" +
                "id=" + id +
                " name='" + nickName + '\'' +
                " password='" + password + '\'' +
                " salary=" + salary +
                '}';
    }

}
