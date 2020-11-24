package home4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        ArrayList<Student> students = readStudents();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENTS");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            if(choice==1){
                System.out.println("Name:");
                String name = in.next();
                System.out.println("Surname:");
                String surname = in.next();
                Student student = new Student(name,surname);
                while (true){
                    System.out.println("    PRESS [1] TO ADD SUBJECT");
                    System.out.println("    PRESS [0] TO GO TO MAIN MENU");
                    int choice2 = in.nextInt();
                    if(choice2==1){
                        System.out.println("Name:");
                        String nameSub = in.next();
                        System.out.println("Credits:");
                        int credits = in.nextInt();
                        Subject subject = new Subject(nameSub,credits);
                        student.addSub(subject);
                    }else {
                        break;
                    }
                }
                students.add(student);
                savePlayers(students);
            }else if(choice==2){
                System.out.println(students);
            }else {
                break;
            }
        }
    }
    public static void savePlayers(ArrayList<Student> students){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("memory.dat"));
            outStream.writeObject(students);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ArrayList<Student> readStudents(){
        ArrayList<Student> students = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("memory.dat"));
            students = (ArrayList<Student>)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){

        }
        return students;
    }
}
