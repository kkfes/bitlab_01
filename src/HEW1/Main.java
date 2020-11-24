package HEW1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String opName = in.next();
        Operation count3 = new Operation(opName,10);




        count3.start();


    }
}
