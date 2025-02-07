// Chonlanna Saikhampa 
// 670510702

import java.util.*;
public class Lab04_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int all = read.nextInt();
        Student stu[] = new Student[all];

        for (int i = 0; i < all; i++) {
            stu[i] = new Student();
            stu[i].setName(read.next());
            stu[i].setNumber(read.nextInt());

            for (int j = 0;j < stu[i].getNumber(); j++) {
                stu[i].setList(read.next(), j);
            }              
        }   
        String subject = read.next();
        int sum = 0;
        for (int i = 0; i < all; i++){
            for (int j = 0; j < stu[i].getNumber(); j++) {
                if (subject.equals(stu[i].getlist()[j])) {
                    System.out.println(stu[i].getName());
                    sum ++;
                } 
            }
        }
        System.out.print(sum);
    }
}

class Student {
    private String name;
    private int num;
    private String list[];

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setNumber(int num) {
        this.num = num;
        list = new String[num];
    }
    public int getNumber() {
        return num;
    }

    public void setList(String sub, int index) {
        list[index] = sub;
    }
    
    public String[] getlist() {
        return list;
    }
}
