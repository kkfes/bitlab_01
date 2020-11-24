package HEW1;

public class Operation extends Thread  {

    String operationName;
    int operationTime;

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    public Operation(String operationName) {
        this.operationName = operationName;
    }

    public void run(){
        System.out.println("Operation started");
        try{
            for(int i=0;i<operationTime;i++){
                System.out.println("Operation "+ operationName + " " + i + " seconds");
                Thread.sleep(2500);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Operation finished");
    }
}
