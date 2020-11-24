package home1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operation operation = new Operation();
        ArrayList<User> users = new ArrayList<>();
        int pinCode = 2020;
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, who you?");
        System.out.println("[1] - Admin" + "\n" + "[2] - User");
        int who = in.nextInt();
        operation.supLoading();
        if(who==1){
            System.out.println("Insert Pin");
            int pin = in.nextInt();
            operation.supLoading();
            if(pin==pinCode){
                while(true){
                    System.out.println("[1] Add User" + "\n" + "[2] List User" + "\n" + "[3] Exit");
                    int choice = in.nextInt();
                    if(choice==1){
                        System.out.println("Adding User\n");
                        System.out.println("Insert id");
                        int id = in.nextInt();
                        System.out.println("Insert Name");
                        String name = in.next();;
                        System.out.println("Insert login");
                        String login = in.next();
                        System.out.println("Insert pin");
                        int pinUser = in.nextInt();
                        User user = new User(id,name,login,pinUser);
                        operation.loading();
                        users.add(user);
                    }else if(choice==2){
                        operation.loading();
                        for(User user : users){
                            System.out.println(user.toString());
                        }
                    }else if(choice==3){
                        System.out.println("\nAre you sure?" + "\n[1] Yes" + "\n[2] No");
                        int exit = in.nextInt();
                        if(exit==1){
                            operation.exit();
                            break;
                        }
                    }else {
                        System.out.println("Incorrect button");
                    }
                }
            }else {
                System.out.println("Pin is incorrect");
            }
        }else if(who==2){
            while (true){
                System.out.println("Hello Muslim, commands are here))");
                System.out.println("[1] My info");
                System.out.println("[2] Exit");
                int choice = in.nextInt();
                if(choice==1){
                    operation.loading();
                    System.out.println("Name - Muslim");
                    System.out.println("Surname - Syzdykov");
                    System.out.println("Study - Collage 1 year");
                    System.out.println("\nMore info?");
                    System.out.println("[1] Yes");
                    System.out.println("[2] No");
                    int info = in.nextInt();
                    if(info==1){
                        operation.loading();
                        System.out.println("\n");
                        System.out.println("\n");
                        System.out.println("\n");
                        System.out.println("Name - Muslim");
                        System.out.println("Surname - Syzdykov");
                        System.out.println("Study - Collage 1 year");
                        System.out.println("Phone - Redmi 8");
                        System.out.println("Live - Almaty");
                        System.out.println("Mail - musiks005@gmail.com");
                    }
                }else if(choice==2){
                    System.out.println("\nAre you sure?" + "\n[1] Yes" + "\n[2] No");
                    int exit = in.nextInt();
                    if(exit==1){
                        operation.exit();
                        break;
                    }
                } else {
                    System.out.println("Incorrect button");
                }
            }
        }else {
            System.out.println("Error");
        }
    }
}
