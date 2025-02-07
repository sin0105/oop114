// 670610702 
//Chonlanna Saikhampa

import java.util.*;
import java.text.*;

public class Lab05_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String size = read.next();
        double radius = read.nextDouble();
        double height = read.nextDouble();

        DecimalFormat dec = new DecimalFormat("0.0");

        Circle cri = new Circle();
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                cri.setData(2, 6);
                cri.calVolume();
                System.out.println("1st constructor");
                System.out.println("Size02" + " " + dec.format(cri.getVolume()));
            }
            else {
                cri.setData(radius, height);
                cri.calVolume();
                System.out.println("2nd constructor");
                System.out.println(size + " " + dec.format(cri.getVolume()));
            }
        }
    }
}


class Circle {
    private double radius, height, volume;
   
    public void setData(double r, double h) {
        radius = r;
        height = h;
    }
        
    public void calVolume() {
        volume = Math.PI * Math.pow(radius,2) * height;
    }
    
    public double getVolume() {
        return volume;
    }
  
}