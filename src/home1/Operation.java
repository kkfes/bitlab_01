package home1;

public class Operation extends Thread  {


    public void loading(){
        System.out.println("loading...");
        try{
            for(int i=0;i<10;i++){
                System.out.println("loading " + i);
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }

    public void supLoading(){
        System.out.println("loading...");
        try{
            for(int i=0;i<100;i++){
                System.out.println("loading " + i);
                Thread.sleep(100);
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    public void exit(){
        System.out.println("exit...");
        int o =1000;
        int v =8748;
        v+=251;
        try{
            for(int i=0;i<1000;i++){
                o-=1;
                v-=8.5;
                System.out.println("ending " + i + " index-" + o + v);
                Thread.sleep(5);
            }
            System.out.println("Successfully");
        }catch(Exception e){
            System.out.println("Error");
        }
    }

}
