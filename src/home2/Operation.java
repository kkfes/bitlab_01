package home2;

public class Operation extends Thread  {


    public void buy(){
        System.out.println("Идет покупка...");
        try{
            for(int i=0;i<10;i++){
                System.out.println("Покупка " + i);
                Thread.sleep(60,5);
            }
        }catch(Exception e){
            System.out.println("Ошибка");
        }
        System.out.println("Успешно");
    }
    public void up(){
        System.out.println("Пополнение баланса...");
        try{
            for(int i=0;i<10;i++){
                System.out.println("Пополнение " + i);
                Thread.sleep(60,5);
            }
        }catch(Exception e){
            System.out.println("Ошибка");
        }
        System.out.println("Успешно");
    }
    public void loading(){
        System.out.println("Загрузка...");
        try{
            for(int i=0;i<10;i++){
                System.out.println("Загрузка " + i);
                Thread.sleep(60,5);
            }
        }catch(Exception e){
            System.out.println("Ошибка");
        }
    }

    public void supLoading(){
        System.out.println("Загрузка...");
        try{
            for(int i=0;i<100;i++){
                System.out.println("Загрузка " + i);
                Thread.sleep(12,5);
            }
        }catch(Exception e){
            System.out.println("Ошибка");
        }
    }
    public void exit(){
        System.out.println("Выход...");
        int o =1000;
        int v =8748;
        v+=251;
        try{
            for(int i=0;i<1000;i++){
                o-=1;
                v-=8.5;
                System.out.println("Выход " + i + " индекс-" + o + v + " файл-" + v + o);
                Thread.sleep(2);
            }
            System.out.println("Выход 1000");
            System.out.println("Выход успешно завершен, аккаунт зашифрован!");
        }catch(Exception e){
            System.out.println("Ошибка");
        }
    }

}
