package num1;

public class User {
    String name;
    String surname;
    String login;
    int pin;

    public User(String name, String surname, String login, int pin) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", pin=" + pin +
                '}';
    }
}
