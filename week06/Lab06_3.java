// 670610702 
//Chonlanna Saikhampa

import java.util.*;
public class Lab06_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char type1 =  read.next().charAt(0);
        Timestamp timeA = readTimestamp(read,type1);
       
        char type2 =  read.next().charAt(0);
        Timestamp timeB = readTimestamp(read,type2);

        char operator = read.next().charAt(0);
        char typeCheck = read.next().charAt(0);

        Timestamp sum;
        
        if (operator == '-') {sum = timeA.diff(timeB);}
        else {sum = timeA.plus(timeB);}

        if (typeCheck == 'R' || typeCheck ==  'r') {
            if (sum.getTime() <= 0) {System.out.print('0');}
            else{System.out.print(String.valueOf(sum.getTime()));}
        }
        else {System.out.println(sum.toString());}
    }

    private static Timestamp readTimestamp(Scanner read,char type) {
        if (type == 'T' || type == 't') {
            String strInput [] = read.nextLine().trim().split(" ");

            int day = Integer.parseInt(strInput[0]); 
            int hour = Integer.parseInt(strInput[1]);
            int minute = Integer.parseInt(strInput[2]); 
            int second = Integer.parseInt(strInput[3]);

            int fromT = day*86400 + hour*3600 + minute*60 + second;
            return new Timestamp(fromT); 
        }
        else {
            int fromR = read.nextInt();
            return new Timestamp(fromR);
        }

    }

}

class Timestamp {
    private int value ;

    public Timestamp(int v) {
        value = v;
    }

    public int getTime() {
        return value;
    }

    public Timestamp diff(Timestamp valueB) {
        int timeC = value - valueB.getTime();
        return new Timestamp(timeC);
    }

    public Timestamp plus(Timestamp valueB) {
        int timeC = value + valueB.getTime();
        return new Timestamp(timeC);
    }

    @Override
    public String toString() {
        int day_c, hour_c, minute_c, second_c;
        if (value <= 0) {
            day_c = 0;
            hour_c = 0;
            minute_c = 0;
            second_c = 0;
        }
        else {
            day_c = value / 86400;
            int d = value % 86400;
            
            hour_c = d / 3600;
            int h = d % 3600;

            minute_c = h / 60;
            second_c = h % 60;
        }
        return String.format("%d:%02d:%02d:%02d", day_c, hour_c, minute_c, second_c);
    }
}
