// 670510702 Chonlanna Saikhampa
import java.util.*;
import java.text.*;
public class Lab03_2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        char type = read.next().charAt(0);
        int time = read.nextInt();

        Course book = new Course();
        book.setType(type);
        book.setTime(time);
       
        type = read.next().charAt(0);
        time = read.nextInt();
        Course book2 = new Course();
        book2.setType(type);
        book2.setTime(time);

        book.Calculate();
        book2.Calculate();
    
    }
}

class Course {
    private char type;
    private int time;
    DecimalFormat dec = new DecimalFormat("0.00");

    public void setType(char type){
        this.type = Character.toLowerCase(type);
    }

    public void setTime(int time){
        this.time = time;
    }

    public void Calculate() {
        if (type == 'e')
            System.out.print(dec.format(English()) + " ");
        else if (type == 'm')
            System.out.print(dec.format(Math()) + " ");
        
    }

    private float English() {
        int i;
        float result = 0;
        for (i=1;i<=time;i++){
            if (i == 1)
                result += 800;
            else if (i >= 2 && i <= 5)
                result += 780;
            else if  (i >= 6 && i <= 10)
                result += 750;
            else if (i >= 11)
                result += 650.50;
        }
        return result;
    }

    private float Math() {
        int i;
        float result = 0;
        for (i=1;i<=time;i++){
            result += 700;
        }
        return result;
    }
   
}