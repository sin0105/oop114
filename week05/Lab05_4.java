// 670610702 
//Chonlanna Saikhampa

import java.util.*;
import java.text.*;

public class Lab05_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int all = read.nextInt();
        DecimalFormat dec = new DecimalFormat("0.00");

        Student stu[] = new Student[all];
        for (int i = 0; i < all; i++) {
            stu[i] = new Student();
            stu[i].setData(read.next().charAt(0), read.nextInt());
            stu[i].calgrade();
            System.out.print(stu[i].getAlpha() + " ");
            System.out.print(stu[i].getGrade() + " ");
            System.out.print(stu[i].getUnit() + " ");
            System.out.println((int) stu[i].getSum());
        }
        
        double avg = (double) Student.showAll() / (double) Student.showUnit();
        System.out.println(Student.showUnit() + " " + Student.showAll() + " " + dec.format(avg));
    }
}

class Student {
    private char alpha;
    private int unit, grade;
    private int sum;

    public static int countGrade = 0;
    public static int countUnit = 0;

    public void setData(char alpha, int unit) {
        this.alpha = alpha;
        this.unit = unit;
    }
    
    public void calgrade() {
        if (alpha == 'A')
            grade = 4;
        else if (alpha == 'B')
            grade = 3;
        else if (alpha == 'C')
            grade = 2;
        else if (alpha == 'D')
            grade = 1;
        else
            grade = 0;
    }
    
    public char getAlpha() {
        return alpha;
    }

    public int getUnit() {
        countUnit += unit;
        return unit;
    }

    public int getGrade() {
        return grade;
    }

    public double getSum() {
        sum = grade * unit;
        countGrade += sum;
        return sum;
    }

    public static int showUnit() {
        return countUnit;
    }
    
    public static int showAll() {
        return countGrade;
    }
}