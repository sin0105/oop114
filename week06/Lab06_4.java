// 670610702 
//Chonlanna Saikhampa

import java.util.*;
public class Lab06_4 {

    static Customer findCustomer(String test_code, Customer[] custo){
        for (Customer objC : custo) {
            if (objC.code.equals(test_code)) {return objC;}
        } return null;
    }
    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int allP = read.nextInt();
        int round = read.nextInt();
        int i;
        read.nextLine();

        Customer[] cus = new Customer[allP];
        for (i = 0; i < allP; i++) {
            cus[i] = new Customer(read.next(), read.next(), read.nextInt());
        }
        read.nextLine();

        // set default
        Customer cusA = cus[0];
        Customer cusB = cus[0];

        Transaction bank = new Transaction();
        for (i = 0; i < round; i++) {
            String type_of_trans = bank.findType(read.next().charAt(0));
            String code1 = read.next();
            cusA = findCustomer(code1, cus);

            switch (type_of_trans) {
                case "desposit":
                    cusA.Desposit(read.nextInt());
                    break;
                case "withdraw":
                    cusA.Withdraw(read.nextInt());
                    break;
                case "transfer":
                    cusB = findCustomer(read.next(), cus);
                    cusA.Transfer(cusB, read.nextInt());
                    break;
            }
        }
        for (i = 0; i < allP; i++) cus[i].printData();
    }
}

class Customer {
    public String code;
    private String name;
    private int balance;

    Customer(String C, String N , int B) {
        code = C;
        name = N;
        balance = B;
    }

    public void printData() {
        System.out.println(code + ' ' + name + ' ' + balance);
    }

    public void Desposit (int money) {
        balance += money;
    }

    public void Withdraw (int money){
        if (balance - money >= 100) {balance -= money;}
    }

    public void Transfer(Customer cusB, int money) {
        if (balance - money >= 100) {
            balance -= money;
            cusB.balance += money;
        }
    }

}

class Transaction {
    private char type;

    public String findType(char T) {
        type = T;
        if (type == 'D') {return "desposit";}
        if (type == 'W') {return "withdraw";}
        else return "transfer";
    }
}
