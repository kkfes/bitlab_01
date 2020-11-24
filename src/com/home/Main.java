package com.home;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);


        ArrayList<User> users = read();
        BufferedWriter userWriter = null;
        BufferedReader userReader;
        try{
            userWriter = new BufferedWriter(new FileWriter("file.txt"));
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            userReader = new BufferedReader(new FileReader("file.txt"));
        }catch(Exception e){
            e.printStackTrace();
        }
        while (true){
            System.out.println("____________________________");
            System.out.println("        PRESS [1] TO ADD USERS" +
                    "\n" +
                    "        PRESS [2] TO LIST USERS" +
                    "\n" +
                    "        PRESS [3] TO DELETE USERS" +
                    "\n" +
                    "        PRESS [4] TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("Input id");
                int id = in.nextInt();
                System.out.println("Input login");
                String login = in.next();
                System.out.println("Input password");
                String password = in.next();
                User user = new User(id,login,password);
                users.add(user);
                write(users);
            }else if(choice==2){
                for (User user : users) {
                    System.out.println(user.toString());
                }
            }else if(choice==3){
                System.out.println("Input id");
                int id = in.nextInt();
                users.remove(id);
            }else {
                userWriter.close();
                break;
            }
        }



    }
    public static ArrayList<User> read(){

        ArrayList<User> result  = new ArrayList<>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String id;
            User user = null;

            while ( (id= reader.readLine()) != null){
                int id2 = Integer.parseInt(id);
                String login = reader.readLine();
                String password  = reader.readLine();

                user = new User(id2,login,password + "\n");
                result.add(user);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
    public static void write(ArrayList<User> users){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("input.txt"));
            for (User u:users){
                writer.write(u.id + "\n");
                writer.write(u.login + "\n");
                writer.write(u.password + "\n");
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
