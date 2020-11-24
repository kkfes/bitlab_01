package home3;

import java.util.Date;

public class BuyHistory {
    String goodName;
    int goodPrice;
    Date buyTime;

    public BuyHistory(String goodName, int goodPrice, Date buyTime) {
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.buyTime = buyTime;
    }

    public BuyHistory(String goodName, int goodPrice){
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.buyTime = new Date();
    }

    @Override
    public String toString() {
        return "BuyHistory{" +
                "goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                ", buyTime=" + buyTime +
                '}';
    }
}
