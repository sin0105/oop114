// 670610702 
//Chonlanna Saikhampa

import java.util.*;
public class Lab05_2 {
    public static void compareWeightbase(Person p1, Person p2){ 
        int diff1 = Math.abs(p1.getWeight() - p1.getStandardWeight());
        int diff2 = Math.abs(p2.getWeight() - p2. getStandardWeight());

        if (diff1 == diff2)
            System.out.println("both");
        else
            if (diff1 < diff2)
                System.out.println(p1.getName());
            else
                System.out.println(p2.getName());
        }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String s = read.next().trim(); 
        Person p1 = new Person(s); 
        char sex = read.next().charAt(0);
        int H = read.nextInt();
        int W = read.nextInt();
        p1.setInfo(sex, H, W);

        s = read.next().trim();
        sex = read.next().charAt(0);
        Person p2 = new Person(s, sex, read.nextInt(), read.nextInt()) ;
        compareWeightbase(p1, p2); 
    } 
} 

class Person {
    private String s;
    private char sex;
    private int H, W;

    public Person(String name) {
        s = name;
    }

    public Person(String name, char sex, int height, int weight) {
        s = name;
        this.sex = sex;
        H = height;
        W = weight;
    }

    public String getName() {
        return s;
    }
    public void setInfo(char sex, int height, int weight) {
        this.sex = sex;
        H = height;
        W = weight;
    }

    public int getWeight() {
        if (sex == 'F') 
            return H - 110;
        else
            return H - 100;
    }
    
    public int getStandardWeight() {
        return W;
    }

}