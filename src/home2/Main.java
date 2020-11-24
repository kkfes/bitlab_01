package home2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Operation loading = new Operation();
        Operation buy = new Operation();
        Operation upM = new Operation();

        Scanner in = new Scanner(System.in);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();

        Product milk = new Product("молоко", 150);
        Product bread = new Product("хлеб", 70);
        Product jacket = new Product("куртка", 25990);
        Product hat = new Product("кепка", 1900);
        Product doll = new Product("кукла", 990);
        Product pampers = new Product("памперс", 1500);
        Product phone = new Product("Xiaomi Redmi 8", 60000);

        products.add(milk);
        products.add(bread);
        products.add(jacket);
        products.add(hat);
        products.add(doll);
        products.add(pampers);
        products.add(phone);

        BankAccount account = new BankAccount(964390850, 2545, "Muslim", "Syzdykov", 35000, 150,500);

        while (true) {
            System.out.println("[1] Купить");
            System.out.println("[2] Пополнить");
            System.out.println("[3] Все продукты");
            System.out.println("[4] Мой аккаунт");
            System.out.println("[5] Конкурсы");
            System.out.println("[6] Действие картой");
            System.out.println("[0] Выход");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Ваш пароль");
                int pin = in.nextInt();
                loading.supLoading();
                if (pin == 266) {
                    while (true) {
                        System.out.println("Выбор продукта");
                        int num = 1;
                        for (Product product : products) {
                            System.out.println("[" + num + "]" + " " + product.name + " стоймость-" + product.cost);
                            num++;
                        }
                        System.out.println("[8] внести сумму");
                        System.out.println("[0] выход");
                        int select = in.nextInt();
                        if (select == 1) {
                            account.getBalance(milk.cost);
                            account.upCoin(25);
                        } else if (select == 2) {
                            account.getBalance(bread.cost);
                            account.upCoin(10);
                        } else if (select == 3) {
                            account.getBalance(jacket.cost);
                            account.upCoin(500);
                        } else if (select == 4) {
                            account.getBalance(hat.cost);
                            account.upCoin(100);
                        } else if (select == 5) {
                            account.getBalance(doll.cost);
                            account.upCoin(50);
                        } else if (select == 6) {
                            account.getBalance(pampers.cost);
                            account.upCoin(150);
                        } else if (select == 7) {
                            account.getBalance(phone.cost);
                            account.upCoin(600);
                            account.upBalance(9000);
                            System.out.println("Кэшюэк 15% поплнены " + 9000);
                        } else if (select == 8) {
                            System.out.println("Вводите");
                            int insert = in.nextInt();
                            account.getBalance(insert);
                            account.upCoin(20);
                        } else {
                            System.out.println("Ты уверен?");
                            System.out.println("[1] Да / [2] Нет");
                            int exit = in.nextInt();
                            if (exit == 1) {
                                buy.buy();
                                System.out.println("У тебя " + account.balance + " денег и " + account.coin + " бонусов");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Пин код неверный\n");
                }
            } else if (choice == 2) {
                while (true) {
                    System.out.println("[1] Пополнить 1,000");
                    System.out.println("[2] Пополнить 5,000");
                    System.out.println("[3] Пополнить 10,000");
                    System.out.println("[4] Пополнить 25,000");
                    System.out.println("[5] Внести сумму пополнения");
                    System.out.println("[6] Пополнить бонусами");
                    System.out.println("[7] Пополнить карту");
                    System.out.println("[0] Выход");
                    int up = in.nextInt();
                    if (up == 1) {
                        account.upBalance(1000);
                        account.upCoin(5);
                    } else if (up == 2) {
                        account.upBalance(5000);
                        account.upCoin(10);
                    } else if (up == 3) {
                        account.upBalance(10000);
                        account.upCoin(20);
                    } else if (up == 4) {
                        account.upBalance(25000);
                        account.upCoin(50);
                    } else if (up == 5) {
                        System.out.println("Вводите");
                        int insert = in.nextInt();
                        account.upBalance(insert);
                        if (insert <= 1000) {
                            account.upCoin(5);
                        } else if (insert > 1000 && insert <= 5000) {
                            account.upCoin(10);
                        } else if (insert > 5000 && insert <= 10000) {
                            account.upCoin(20);
                        } else if (insert > 10000 && insert <= 25000) {
                            account.upCoin(50);
                        } else if (insert >= 1000000) {
                            account.upCoin(1000);
                        } else if (insert > 25000 && insert < 1000000) {
                            account.upCoin(100);
                        }
                    } else if (up == 6) {
                        account.upBalance(account.coin);
                        account.getCoin(account.coin);
                        System.out.println("Успешно\n");
                    }else if(up==7){
                        System.out.println("Введи сумму пополнения");
                        int upCard = in.nextInt();
                        account.cardBankUp(upCard);
                        System.out.println("Основной баланс " + account.balance);
                        System.out.println("Баланс карты " + account.card);
                    } else {
                        System.out.println("Ты уверен?");
                        System.out.println("[1] Да / [2] Нет");
                        int exit = in.nextInt();
                        if (exit == 1) {
                            upM.up();
                            System.out.println("У тебя " + account.balance);
                            break;
                        }
                    }
                }
            } else if (choice == 3) {
                loading.loading();
                for (Product product : products) {
                    System.out.println(product.toString());
                }
            } else if (choice == 4) {
                loading.loading();
                System.out.println(account.toString());
            } else if (choice == 5) {
                System.out.println("Выбор игры");
                System.out.println("[1] от 1 до 5 стоймость 200");
                System.out.println("Возможно победить 300");
                System.out.println("[2] от 1 до 10 стоймость 150");
                System.out.println("Возможно победить 250 или 500");
                System.out.println("[3] от 1 до 5 стоймость 1000");
                System.out.println("Возможно победить 3000");
                int choiceG = in.nextInt();
                if (choiceG == 1) {
                    System.out.println("Ваш баланс " + account.balance);
                    account.getBalance(200);
                    System.out.println("Списано 200" +
                            "");
                    System.out.println("Ваш баланс " + account.balance);
                    double win = Math.floor(Math.random() * 5);
                    if (win == 1) {
                        System.out.println("Победа");
                        account.upCoin(300);
                    } else if (win == 2) {
                        System.out.println("Пройгрыш");
                    } else if (win == 3) {
                        System.out.println("Пройгрыш");
                    } else if (win == 4) {
                        System.out.println("Победа");
                        account.upCoin(300);
                    } else {
                        System.out.println("Пройгрыш");
                    }
                } else if (choiceG == 2) {
                    System.out.println("Ваш баланс " + account.balance);
                    account.getBalance(150);
                    System.out.println("Списано 150");
                    System.out.println("Ваш баланс " + account.balance);
                    double win = Math.floor(Math.random() * 10);
                    if (win == 1) {
                        System.out.println("Победа");
                        account.upCoin(250);
                    } else if (win == 2) {
                        System.out.println("Пройгрыш");
                    } else if (win == 3) {
                        System.out.println("Пройгрыш");
                    } else if (win == 4) {
                        System.out.println("Победа");
                        account.upCoin(250);
                    } else if (win == 5) {
                        System.out.println("Пройгрыш");
                    } else if (win == 6) {
                        System.out.println("Победа");
                        account.upCoin(250);
                    } else if (win == 7) {
                        System.out.println("Пройгрыш");
                    } else if (win == 8) {
                        System.out.println("Победа - 500");
                        account.upCoin(500);
                    } else if (win == 9) {
                        System.out.println("Пройгрыш");
                    } else {
                        System.out.println("Вернули 150");
                        account.upCoin(150);
                    }
                } else if (choiceG == 3) {
                    System.out.println("Ваш баланс " + account.balance);
                    System.out.println("Супер игра оплачено 1000 тг");
                    account.getBalance(1000);
                    System.out.println("Ваш баланс " + account.balance);
                    double win = Math.floor(Math.random() * 5);
                    if (win == 1) {
                        System.out.println("Победа");
                        account.upCoin(3000);
                    } else {
                        System.out.println("Пройгрыш");
                    }
                }else if(choiceG==10){
                    System.out.println("Ставкаи на сторону");
                    System.out.println("[1] Левая");
                    System.out.println("[2] Правая");
                    System.out.println("[3] Супер выгода 150");
                    int bigGame = in.nextInt();
                    if(bigGame==1){
                        System.out.println("Сумма ставки");
                        int money = in.nextInt();
                        account.getBalance(money);
                        double win = Math.floor(Math.random() * 10);
                        if(win>5){
                            System.out.println("Победа");
                            int give = money/3;
                            account.upBalance(money + give);
                            System.out.println("Ты получил " + (give+money));
                        }else{
                            System.out.println("Пройгрыш");
                        }
                    }else if(bigGame==2){
                        System.out.println("Сумма ставки");
                        int money = in.nextInt();
                        account.getBalance(money);
                        double win = Math.floor(Math.random() * 10);
                        if(win>5){
                            System.out.println("Пройгрыш");
                        }else{
                            int give = money/3;
                            System.out.println("Победа");
                            account.upBalance(money + give);
                            System.out.println("Ты получил " + (give+money));
                        }
                    }else if(bigGame==3){
                        account.getBalance(150);
                        System.out.println("Ставкаи на сторону");
                        System.out.println("[1] Левая");
                        System.out.println("[2] Правая");
                        int bigGame2 = in.nextInt();
                        System.out.println("Сумма ставки");
                        int money2 = in.nextInt();
                        account.getBalance(money2);
                        if(bigGame2==1){
                            double win = Math.floor(Math.random() * 10);
                            if(win>5){
                                System.out.println("Победа");
                                int give2 = money2/2;
                                account.upBalance(money2 + give2);
                                System.out.println("Ты получил " + (give2+money2));
                            }else{
                                System.out.println("Пройгрыш");
                            }
                        }else if(bigGame2==2){
                            double win = Math.floor(Math.random() * 10);
                            if(win>5){
                                System.out.println("Пройгрыш");
                            }else{
                                int give2 = money2/2;
                                System.out.println("Победа");
                                account.upBalance(money2 + give2);
                                System.out.println("Ты получил " + (give2+money2));
                            }
                        }
                    }
                }
            } else if (choice == 6) {
                System.out.println("[1] купить");
                System.out.println("[2] пополнить");
                System.out.println("[3] пополнить основной счет");
                int cardChoice = in.nextInt();
                if (cardChoice == 1) {
                        while (true) {
                            System.out.println("Выбор продукта");
                            int num = 1;
                            for (Product product : products) {
                                System.out.println("[" + num + "]" + " " + product.name + " стоймость-" + product.cost);
                                num++;
                            }
                            System.out.println("[8] внести сумму");
                            System.out.println("[0] выход");
                            int select = in.nextInt();
                            if (select == 1) {
                                account.cardGet(milk.cost);
                                account.upCoin(40);
                            } else if (select == 2) {
                                account.cardGet(bread.cost);
                                account.upCoin(30);
                            } else if (select == 3) {
                                account.cardGet(jacket.cost);
                                account.upCoin(600);
                            } else if (select == 4) {
                                account.cardGet(hat.cost);
                                account.upCoin(150);
                            } else if (select == 5) {
                                account.cardGet(doll.cost);
                                account.upCoin(100);
                            } else if (select == 6) {
                                account.cardGet(pampers.cost);
                                account.upCoin(200);
                            } else if (select == 7) {
                                account.cardGet(phone.cost);
                                account.upCoin(1000);
                                account.upCard(10000);
                                System.out.println("Кэшюэк 25% поплнены " + 10000 + " + бонусы " + 1000);
                            } else if (select == 8) {
                                System.out.println("Вводите");
                                int insert = in.nextInt();
                                account.cardGet(insert);
                                account.upCoin(20);
                            } else {
                                System.out.println("Ты уверен?");
                                System.out.println("[1] Да / [2] Нет");
                                int exit = in.nextInt();
                                if (exit == 1) {
                                    buy.buy();
                                    System.out.println("У тебя " + account.card + " денег и " + account.coin + " бонусов");
                                    break;
                                }
                            }
                        }
                    }else if(cardChoice==2){
                        while (true) {
                            System.out.println("[1] Пополнить 1,000");
                            System.out.println("[2] Пополнить 5,000");
                            System.out.println("[3] Пополнить 10,000");
                            System.out.println("[4] Пополнить 25,000");
                            System.out.println("[5] Внести сумму пополнения");
                            System.out.println("[6] Пополнить бонусами");
                            System.out.println("[7] Выход");
                            int up = in.nextInt();
                            if (up == 1) {
                                account.cardUp(1100);
                                account.upCoin(5);
                            } else if (up == 2) {
                                account.cardUp(5100);
                                account.upCoin(10);
                            } else if (up == 3) {
                                account.cardUp(10000);
                                account.upCoin(20);
                            } else if (up == 4) {
                                account.cardUp(25000);
                                account.upCoin(50);
                            } else if (up == 5) {
                                System.out.println("Вводите");
                                int insert = in.nextInt();
                                account.cardUp(insert);
                                if (insert <= 1000) {
                                    account.upCoin(5);
                                } else if (insert > 1000 && insert <= 5000) {
                                    account.upCoin(10);
                                } else if (insert > 5000 && insert <= 10000) {
                                    account.upCoin(20);
                                } else if (insert > 10000 && insert <= 25000) {
                                    account.upCoin(50);
                                } else if (insert >= 1000000) {
                                    account.upCoin(1000);
                                } else if (insert > 25000 && insert < 1000000) {
                                    account.upCoin(100);
                                }
                        } else if (up == 6) {
                            account.cardUp(account.coin);
                            account.getCoin(account.coin);
                            System.out.println("Успешно\n");
                        } else {
                            System.out.println("Ты уверен?");
                            System.out.println("[1] Да / [2] Нет");
                            int exit = in.nextInt();
                            if (exit == 1) {
                                upM.up();
                                System.out.println("У тебя " + account.card);
                                break;
                            }
                        }
                    }
                    }else if(cardChoice==3){
                        System.out.println("Введите сумму");
                        int cost = in.nextInt();
                        account.upHome(cost);
                        System.out.println("Баланс основного счета пополнен на " + cost);
                        System.out.println("Ваш баланс основного счета " + account.balance);
                        System.out.println("Ваш баланс карты " + account.card);
                    }
                } else {
                    System.out.println("Ты уверен?");
                    System.out.println("[1] Да / [2] Нет");
                    int exit = in.nextInt();
                    if (exit == 1) {
                        loading.exit();
                        break;
                    }
              }
        }
    }
}
