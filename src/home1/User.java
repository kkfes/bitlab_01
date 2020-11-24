package home1;

public class User {
    int id;
    String name;
    String login;
    int pin;

    public User() {
    }

    public User(int id, String name, String login, int pin) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", pin=" + pin +
                '}';
    }
}
