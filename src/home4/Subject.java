package home4;

import java.io.Serializable;
import java.util.ArrayList;

public class Subject implements Serializable {
    String name;
    int credits;

    public Subject() {
    }

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }

}
