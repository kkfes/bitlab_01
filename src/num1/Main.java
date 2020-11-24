package num1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        while (true){
            System.out.println("Add User [1]");
            System.out.println("List User [2]");
            System.out.println("Delete user [3]");
            System.out.println("Exit [4]");
            int choice = 1;
            try {
                choice = in.nextInt();
            }catch (Exception e){
                System.out.println("\nError\n");
            }
            if(choice==1){
                System.out.println("Add User\n");
                System.out.println("Name:");
                String name = in.next();
                System.out.println("Surname:");
                String surname = in.next();
                System.out.println("Login:");
                String login = in.next();
                System.out.println("Pin:");
                int pin = 0;
                try {
                    pin = in.nextInt();
                }catch (Exception e){
                    System.out.println("\nError\n");
                }
                User user = new User(name,surname,login,pin);
                System.out.println("Add user?");
                System.out.println("[1] Yes / [2] No");
                int add = 0;
                try {
                    add = in.nextInt();
                }catch (Exception e){
                    System.out.println("\nError\n");
                }
                if(add==1){
                    System.out.println("Adding\n");
                    users.add(user);
                    System.out.println("Added");
                }
            }else if(choice==2){
                for (User user : users) {
                    System.out.println(user.toString());
                }
            }else if(choice==3){
                System.out.println("Deleting user");
                System.out.println("Chose user by index");
                int id = 0;
                try {
                    id = in.nextInt();
                }catch (Exception e){
                    System.out.println("\nError\n");
                }
                System.out.println("Are you sure?");
                System.out.println("You want to delete?");
                System.out.println("[1] Yes / [2] No");
                int delete = 0;
                try {
                    delete = in.nextInt();
                }catch (Exception e){
                    System.out.println("\nError\n");
                }
                if(delete==1){
                    try {
                        users.remove(id);
                        System.out.println("Deleted");
                    }catch (Exception e){
                        System.out.println("\nError");
                        System.out.println("Incorrect user\n");
                    }
                }
            }else {
                System.out.println("Are you sure?");
                System.out.println("You want to exit?");
                System.out.println("[1] Yes / [2] No");
                int exit = 0;
                try {
                    exit = in.nextInt();
                }catch (Exception e){
                    System.out.println("\nError\n");
                }
                if(exit==1){
                    break;
                }
            }
        }
    }
}
