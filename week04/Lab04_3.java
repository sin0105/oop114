// Chonlanna Saikhampa 
// 670510702

import java.util.*;
public class Lab04_3 {
    public static void main(String[] args){
        Student score = new Student();
        score.setList();
        score.getMax();
        score.getMin();
        score.getIndexMax();
        score.getIndexMin();
        score.getAverage();
        score.printValue();
    }
}

class Student{
    private ArrayList<Integer> list = new ArrayList<Integer>();
    int i, j, k, max = 0, min = 100, indMax, indMin, sum = 0, stu = 0;

    public void setList() {
        Scanner read = new Scanner(System.in);
        int num;
        while (true){
            num = read.nextInt();
            if (num >=1 && num <=100)
                list.add(num);
            else if (num == 0)
                break;
        }
    }

    public int getMax(){
        int size = list.size(); 
        for (i = 0; i < size; i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public int getMin(){
        int size = list.size();
        for (j = 0; j < size; j++){
            if (list.get(j) < min){
                min = list.get(j);
            }
        }
        return min;
    }

    public int getIndexMax(){
        indMax = list.indexOf(max);
        return indMax;
    }

    public int getIndexMin(){
        indMin = list.indexOf(min);
        return indMin;
    }

    public int getAverage(){
        int size = list.size();
        for (k = 0; k < size; k++){
            sum += list.get(k);
        }
        double avg = (double) sum/list.size();

        for (k = 0; k < size; k++){
            if (list.get(k) < avg)
                stu ++;
        }
        return stu;
    }

    public void printValue(){
        System.out.println(max + " " + (indMax+1));
        System.out.println(min + " " + (indMin+1));
        System.out.print(stu);
    }

}
