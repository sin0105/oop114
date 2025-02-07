// Atithep Thepkij
// 670510681
// Lab06_4
// 204114 Sec 003

import java.util.Scanner;

public class Lab06_4 {
    static void deposit(Customer person, int money){
      person.money += money;
    }

    static void withdraw(Customer person, int money){
      if (person.money - money >= 100) person.money -= money;
    }

    static void transfer(Customer person1, Customer person2, int money){
      if (person1.money - money >= 100){
        person1.money -= money;
        person2.money += money;
      }
    }

    static Customer findPerson(String compare_id, Customer[] person){
      for (Customer customer : person)
        if (customer.id.equals(compare_id)) return customer;
      return null;
    }

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    int num_customer = kb.nextInt();
    int num_transac = kb.nextInt();
    kb.nextLine();

    Customer[] person = new Customer[num_customer];
    for (int i = 0; i < num_customer; i++) person[i] = new Customer(kb.next(), kb.next(), kb.nextInt());
    kb.nextLine();

    Transaction transac = new Transaction();
    //Customer checked_person_a = person[0], checked_person_b = person[0]; // init Customer Class

    for (int i = 0; i < num_transac; i++) {
      String type = transac.checkType(kb.next().charAt(0));

      String id_a = kb.next();
      Customer checked_person_a = findPerson(id_a, person);

      if (type.equals("transfer")){
        String id_b = kb.next();
        Customer checked_person_b = findPerson(id_b, person);
      }

      int money = kb.nextInt();
      kb.nextLine(); // comment when submit grader

      if (type.equals("deposit")) deposit(checked_person_a, money);
      else if (type.equals("withdraw")) withdraw(checked_person_a, money);
      else if (type.equals("transfer")) transfer(checked_person_a, checked_person_b, money);
    }

    for (int i = 0; i < num_customer; i++) person[i].displayStatus(); 
  }
}

class Customer {
  public String id;
  private String name;
  public int money;

  Customer(String id, String name, int money){
    this.id = id;
    this.name = name;
    this.money = money;
  }

  public void displayStatus(){
    System.out.printf("%s %s %d\n", id, name, money);
  }
}

class Transaction {
  private char type;

  public String checkType(char type) {
    this.type = Character.toUpperCase(type);
    if (this.type == 'D') return "deposit";
    if (this.type == 'W') return "withdraw";
    if (this.type == 'T') return "transfer";
    return "invalid";
  }
}
