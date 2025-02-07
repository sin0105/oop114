import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab07_3 {

    public static void computeProfit( LandForHouse house [] , int N,  LandForSale lands[], int M ){
	    DecimalFormat df = new  DecimalFormat("0.00");
        int i, j;
	    double profit = 0;
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                if (house[i].getland() <= lands[j].getland()) {
                    if (lands[j].getStatus() == 0) {
                        lands[j].upStatus();
                        lands[j].calPrice(house[i].getHouse());
                        profit += lands[j].getSalaryPrice() - lands[j].getEvaluate();
                        break;
                    }
                }
            }
        }

        for (j = 0; j < M; j++) {
            if (lands[j].getSalaryPrice() != 0)
                System.out.println(lands[j].getTitle() + " " + df.format(lands[j].getSalaryPrice()));
        }

        System.out.print(df.format(profit));
     }


    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int M = read.nextInt();
                
        LandForHouse[] house = new LandForHouse[N];
        LandForSale[] lands = new LandForSale[M];
        
        for (int i = 0; i < N; i++) {
            house[i] = new LandForHouse(); 
            house[i].setData(read.nextInt(), read.nextInt());
        }
               
        for (int i = 0; i < M; i++) {
            lands[i] = new LandForSale();
            lands[i].setData(read.nextInt(), read.next(), read.nextInt());
        }
        computeProfit( house, N, lands,  M );
    }
}


class Land {
    protected int landSize;

    public int getland() {
        return landSize;
    }
}

class LandForHouse extends Land {
    private int housePrice;
    
    public void setData(int l, int h) {
        landSize = l;
        housePrice = h;
    }

    public int getHouse() {
        return housePrice;
    }
}

class LandForSale extends Land {
    private String titleDeed;
    private int evaluatePrice, saleStatus = 0;
    private double salePrice = 0;
  
    public void setData(int l, String t, int e) {
        landSize = l;
        titleDeed = t;
        evaluatePrice = e;
    }

    public void upStatus() {
        saleStatus += 1;
    }

    public int getStatus() {
        return saleStatus;
    }

    public String getTitle() {
        return titleDeed;
    }

    public int getEvaluate() {
        return evaluatePrice;
    }

    public void calPrice(int house) {
        salePrice = evaluatePrice + (evaluatePrice * 0.1) + (house * 0.05);
    }

    public double getSalaryPrice() {
        return salePrice;
    }

}