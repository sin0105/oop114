// 670610702 
//Chonlanna Saikhampa

import java.util.Scanner;
public class Lab06_2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Timestamp timeA = readTimestamp(read);
        Timestamp timeB = readTimestamp(read);
        timeA.calplus();
        timeB.calplus();
    
        Timestamp result = timeA.diff(timeB);  
        System.out.println(result.toString());
    }

    private static Timestamp readTimestamp(Scanner read) {
        String strInput [] = read.nextLine().trim().split(":");

        int day = Integer.parseInt(strInput[0]); 
        int hour = Integer.parseInt(strInput[1]);
        int minute = Integer.parseInt(strInput[2]); 
        int second = Integer.parseInt(strInput[3]);

        return new Timestamp(day, hour, minute, second); //return object
    }
}

class Timestamp {
    private int day, hour, minute, second, value;
 
    public Timestamp(int D, int H, int M, int S) {
        day = D;
        hour = H;
        minute = M;
        second = S;
    }
    
    public void calplus() {
        day = day * 86400;
        hour  = hour *3600;
        minute = minute * 60;
        second = second * 1;
        value = day + hour + minute + second;
    }

    public int getplus() {
        return value;
    }

     // operators minus  suchas  timeC =  timeA - timeB
    public Timestamp diff(Timestamp valueB) {
        int timeC = Math.abs(value - valueB.getplus());
        int day_c = timeC / 86400;
        int d = timeC % 86400;
        
        int hour_c = d / 3600;
        int h = d % 3600;

        int minute_c = h / 60;
        int second_c = h % 60;

        return new Timestamp(day_c, hour_c, minute_c, second_c);
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d:%02d", day, hour, minute, second);
    }

}



