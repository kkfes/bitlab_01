package lesson8;

public class User {

    private int id;
    private String nickName;
    private String password;
    private double salary;

    public User() {
    }

    public User(int id, String nickName, String password, double salary) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                '}';
    }
}
