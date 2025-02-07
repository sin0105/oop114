
import java.util.Scanner;

public class Lab08_1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // รับข้อมูลเบื้องต้น
        String orderId = read.next();
        String tableNo = read.next();
        int N = read.nextInt();

        Order order = new Order(N);
        order.setData(orderId, tableNo);
        order.showData();

        for (int i = 0; i < N; ++i) {  
            String foodName = read.next();
            short price = (short) read.nextInt();
            byte numDish = (byte) read.nextInt();
            order.toItem(i, foodName, price, numDish);
        }
        System.out.println(order.getTotal());
    }   

}

class Order {
    private String orderId;
    private String tableNo;
    private OrderItem[] items;
    private int totalPrice = 0;

    public Order(int size) {
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

    public void toItem(int i, String foodName, short price, byte numDish) {
        items[i].setData(foodName, price, numDish);
        int itemTotal = price * numDish; 
        totalPrice += itemTotal; 
        System.out.println((i + 1) + ") " + foodName + " = " + price + " x " + numDish + " = " + itemTotal);
    }

    public int getTotal() {
        return totalPrice;
    }
}

class OrderItem {
    private String foodName;
    private short price;
    private byte numDish;

    public void setData(String f, short p, byte n) {
        foodName = f;
        price = p;
        numDish = n;
    }
}
