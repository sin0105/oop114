// 670510702 Chonlanna Saikhampa
import java.util.*; 
import java.text.*;
public class Lab03_4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int time = read.nextInt();

        Clock show = new Clock();
        show.setTime(time);
        show.Calculate();
        show.printTime();
    }

}
class Clock {
    private int time, day, hour, min, sec;

    public void setTime(int time) {
        this.time = time;
    }

    public void Calculate() {
        day = time / 86400;
        int d = time % 86400;
        hour = d / 3600;
        int h = d % 3600;
        min = h / 60;
        sec = h % 60;
    }

    public void printTime() {
        DecimalFormat dec = new DecimalFormat("00");
        System.out.print(day + ":" + dec.format(hour) + ":" + dec.format(min) + ":" + dec.format(sec));  
        
    }
}