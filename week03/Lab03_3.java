// 670510702 Chonlanna Saikhampa
import java.util.*;
public class Lab03_3 {
    public static void main(String[] args){
        Scanner read = new Scanner (System.in);
        int i, num, space;
         
        num = read.nextInt();
        Student[] stu = new Student[num];
        for (i=0;i<num;i++){
            stu[i] = new Student();
            stu[i].setID(read.next());
            stu[i].setScore(read.nextInt());
            stu[i].setScore(read.nextInt());
            stu[i].calGrade();
         }

        space = read.nextInt();
        for (i=0;i<num;i++){
            if (i % space == 0 && i != 0)
                System.out.println();
            stu[i].printGrade(i+1);
        }
    } 
}
class Student{
    private String id;
    private int sumScore;
    private String grade;

    public void setID(String studentID){
        id = studentID;
    }

    public void setScore(int score) {
        sumScore += score;
    }

    public void calGrade() {
        if (sumScore >= 85 && sumScore <= 100)
            grade = "A";
        else if (sumScore >= 80 && sumScore <= 84)
            grade = "B+";
        else if (sumScore >= 75 && sumScore <= 79)
            grade = "B";
        else if (sumScore >= 60 && sumScore <= 74)
            grade = "C+";
        else if (sumScore >= 55 && sumScore <= 59)
            grade = "C";
        else if (sumScore >= 50 && sumScore <= 54)
            grade = "D+";
        else if (sumScore >= 45 && sumScore <= 49)
            grade = "D";
        else if (sumScore < 45)
            grade = "F";
    }

    public void printGrade(int i){
        System.out.println(i + ")" + " " + id + " " + sumScore + " " + grade);
    }
}