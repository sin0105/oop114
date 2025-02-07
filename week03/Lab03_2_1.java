// 670610702 Chonlanna Saikhampa

import java.util.*;
import java.text.*;
public class Lab03_2_1 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        char type1 = read.next().charAt(0);
        int time1 = read.nextInt();
        char type2 = read.next().charAt(0);
        int time2 = read.nextInt();
        

        if (type1 == 'E' || type1 == 'e')
            System.out.print(df.format(English(time1)) + " ");
        else if (type1 == 'M' || type1 == 'm')
            System.out.print(df.format(Math(time1)) + " ");

        if (type2 == 'E' || type2 == 'e')
            System.out.print(df.format(English(time2)) + " ");
        else if (type2 == 'M' || type2 == 'm')
            System.out.print(df.format(Math(time2)) + " "); 
    }

    private static float English(int time){
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

    private static float Math(int time){
        int i;
        float result = 0;
        for (i=1;i<=time;i++){
            result += 700;
        }
        return result;
    }
}
