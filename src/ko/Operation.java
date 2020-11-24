package ko;

import javax.swing.*;

public class Operation extends Thread  {

    int locX;
    int locY;
    JLabel label;

    public Operation(int loX, int loY, JLabel label) {
        this.locX = loX;
        this.locY = loY;
        this.label = label;
    }
    public void run(){
        try{
            for(int i=0;i<1000;i++){
                locX +=1;
                locX +=1;
                label.setLocation(locX,locY);
                Thread.sleep(20);
            }
        }catch(Exception i){
            i.printStackTrace();
        }
    }
}
