// Chonlanna Saikhampa 
// 670510702
import java.util.*;
public class Lab04_6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num = read.nextInt(),sumAll = 0;
        Student stu[] = new Student[num];
        for (int i=0;i<num;i++) {
            stu[i] = new Student();
            stu[i].setID(read.next());
            stu[i].setScore(read.nextInt());
            stu[i].setScore(read.nextInt());
            sumAll += stu[i].getSumScore();
        }

        String first = read.next();
        String sec = read.next();

        double avg = (double) sumAll/num;
        int count = 0, cal = 0;
        for (int i=0;i<num;i++) {
            stu[i].setFirst(first);
            stu[i].setSec(sec);

            if (stu[i].getAllScore() == true) {
                System.out.println(stu[i].getID() + " " + stu[i].getSumScore());
                count ++;
                if (stu[i].getSumScore() > avg) {
                    cal ++; 
                }
            }   
        }
        if (count != 0 && cal != 0){
            System.out.println(count);
            System.out.print(cal);
        }
        else
            System.out.print("None"); 
    }  
}

class Student {
    private String id;
    private int sumScore;
    private String first;
    private String sec;

    public void setID(String studentID){
        id = studentID;
    }

    public String getID() {
        return id;
    }

    public void setScore(int score) {
        sumScore += score;
    }
    public int getSumScore() {
        return sumScore;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public boolean getAllScore() {
        if (first.equals(id.substring(0,2))) {
            if (sec.equals(id.substring(2,4))) {
                return true;
            }
        }
        return false;
    }
}
