
import java.util.*;

public class test06 {

    public static void Deposite(String id, int money, int allP, People pl[]) {
        for (int i = 0; i < allP; i++ ){
            if (pl[i].getId().equals(id)) pl[i].incress(money);
        }
    }

    public static void Withdraw(String id, int money, int allP, People pl[]) {
        for (int i = 0; i < allP; i++ ){
            if (pl[i].getId().equals(id)) pl[i].discress(money);
        }
    }

    public static void Transaction (String id1, String id2, int money, int allP, People pl[]) {
        for (int i = 0; i < allP; i++ ){
            if (pl[i].getId().equals(id1)) pl[i].discress(money);
            if (pl[i].getId().equals(id2)) pl[i].incress(money);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int allP = read.nextInt();
        int round = read.nextInt();

        People pl[] = new People[allP];
        for (int i = 0; i < allP; i++) {
            pl[i].setData(read.next(), read.next(), read.nextInt());
        }
        
        for (int i = 0; i < round; i++) {
            char type = read.next().charAt(0);
            if (type == 'D') Deposite(read.next(), read.nextInt(), allP, pl);
            else if (type == 'W') Withdraw(read.next(), read.nextInt(), allP, pl);
            else Transaction(read.next(), read.next(),read.nextInt(), allP, pl);
        }

        for (int i = 0; i < allP; i++) {
            pl[i].printData();
        }
    }
}

class People {
    private String id, name;
    private int salary ;

    public void setData(String i, String n, int s) {
        id = i;
        name = n;
        salary = s;
    }
    
    public void incress(int plus){
        salary += plus;
    }

    public void discress(int dis) {
        salary -= dis;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void printData() {
        System.out.print(id + " " + name + " " + salary);
    }
}

class Bank {
    private String id1, id2;
    private int money;
    private char type;

    public void setBank(String i1, int m) {
        id1 = i1;
        money = m;
    }

    public void setBank(String i1, String i2, int m) {
        id1 = i1;
        id2 = i2;
        money = m;
    }

    public String getid1() {
        return id1;
    }

    public String getId2(){
        return id2;
    }

    public int getMoney() {
        return money;
    }
}