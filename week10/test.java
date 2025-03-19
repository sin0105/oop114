import java.util.*;

class test {
    public static void main(String args[]) {

    }
}

class Order {
    private String orderId, tableNo;
    private int N;
    private Object items[];
    private double totalPrice;

   Order(int size) {
        items = new OrderItem[size];
        for (int i = 0; i < size; i++) {
            items[i] = new OrderItem();
        }
   }
   
    public void setData(String o, String t) {
        orderId = o;
        tableNo = t;
    }

    public void showData() {
        System.out.println(orderId + " " + tableNo);
    }

   
}

class OrderItem {
    private String foodName;
    private int price, numDish;

    public void setData(String n, int p, int q) {
        foodName = n;
        price = p;
        numDish = q;
    }
}