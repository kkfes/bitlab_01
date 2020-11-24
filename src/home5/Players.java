package home5;

import java.io.Serializable;

public class Players implements Serializable {
    String nickName;
    double rating;

    public Players() {
    }

    public Players(String nickName, double rating) {
        this.nickName = nickName;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Players{" +
                "nickName='" + nickName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
