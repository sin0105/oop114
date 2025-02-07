// package 204114.week05;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int all = read.nextInt();

        Student stu[] = new Student[all];
        for (int i = 0; i < all; i++) {
            stu[i] = new Student();
            stu[i].setal(read.next().charAt(0));
            // stu[i].setun(read.nextInt());
            // stu[i].printre();
        }
    }
}

class Student {
    private char alpha;
    private int unit;


    public void setal(char alpha) {
        this.alpha = alpha;
        // , read.nextInt()
    }

    // public void setun(int unit) {
    //     this.unit = unit;
    // }

    public void printre() {
        System.out.print(alpha + "->" + unit);
    }
}