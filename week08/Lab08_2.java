import java.util.Scanner;

public class Lab08_2 {
    private static Scanner read = new Scanner(System.in);
	
    public static void main(String[] args) {
        int allSale = 0;
        int M = read.nextInt();
		Food [] foodList = new Food[M];
        for (int i = 0; i < M; i++) {
            foodList[i] = new Food();
            foodList[i].setData(read.next(), (short)read.nextInt());
        }
	
        int K = read.nextInt();
		Order [] orderList = new Order[K];
	
        for (int k = 0;k< K;k++){    
            String orderId = read.next();
            String tableNo = read.next();
            int N = read.nextInt();
            orderList[k] = new Order();
            orderList[k].setData(orderId, tableNo, N);

            for (int i = 0; i < N; i++) {
                String foodName = read.next();
                byte numDish = (byte) read.nextInt();
                orderList[k].addItem(foodName, numDish, foodList);
            }
            orderList[k].calTotal();
            orderList[k].showTotal();
            allSale += orderList[k].getTotalPrice();
        }
        for (Food food : foodList) {
            System.out.printf("%s %d\n", food.getFoodName(), food.getTotal());
        }
    System.out.println(allSale);
  }
}   

class Order {
    private String orderId;
    private String tableNo;
    private int totalPrice = 0;
    private OrderItem items[];
	private int round = 0;

    public void setData(String o, String t, int N) {
        orderId = o;
        tableNo = t; 
        items = new OrderItem[N];
    }
    
    public void addItem(String foodName, byte numDish, Food[] foodList) {
        items[round] = new OrderItem();
        items[round].setData(foodName, numDish, foodList);
        round++;
    }

    public void calTotal(){
        for (OrderItem item : items)
            totalPrice += item.getTotalPrice();
    }
    
    public void showTotal() {
        System.out.printf("%s %s %d\n", this.orderId, this.tableNo, this.totalPrice);
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}

class OrderItem {
    private String foodName;
    private byte numDish;
    private int totalPrice = 0;

    public void setData(String f, byte n, Food[] foodList) {
        foodName = f;
        numDish = n;
        for (Food food : foodList) {
            if (food.getFoodName().equals(foodName)) {
                this.totalPrice = food.getPrice() * numDish;
                food.addSale(numDish);
                break; 
            }
        }

    }

    public int getTotalPrice() {
        return totalPrice;
    }
}

class Food {
    String foodName;
    short price;
    int totalSale = 0;
	
    public void setData(String f, short p) {
        foodName = f;
        price = p;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return totalSale;
    }

    public void addSale(byte numDish) {
        totalSale += numDish * price;
    }

}