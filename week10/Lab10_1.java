//Chonlanna Saikhampa
//670510702
import java.util.*;
public class Lab10_1 {	
    public static <TYPE extends Comparable>  void getMin(TYPE d1, TYPE d2, TYPE d3){ 
        TYPE min = d1;
        if (d2.compareTo(d1) < 0) min = d2;
        if (d3.compareTo(min) < 0) min = d3;

        System.out.println(min + " ");  
    }
    public static <TYPE extends Comparable>  void getCenter(TYPE d1, TYPE d2, TYPE d3){ 
        TYPE center = d1;
        // if ((d1.compareTo(d2) < 0 && d1.compareTo(d3) > 0 )|| (d1.compareTo(d2) > 0 && d1.compareTo(d3) < 0))
        //     center = d1;
        if ((d2.compareTo(d1) <= 0 && d2.compareTo(d3) >= 0 )|| (d2.compareTo(d1) >= 0 && d2.compareTo(d3) <= 0))
            center = d2;
        if ((d3.compareTo(d1) <= 0 && d3.compareTo(d2) >= 0 )|| (d3.compareTo(d1) >= 0 && d3.compareTo(d2) <= 0))
            center = d3;
        System.out.println(center + " ");  
        
        
    }
    public static <TYPE extends Comparable>  void getMax(TYPE d1, TYPE d2, TYPE d3){ 
        TYPE max = d1;
        if (d2.compareTo(d1) > 0) max = d2;
        if (d3.compareTo(max) > 0) max = d3;
        System.out.println(max + " ");  
    }

    public static <TYPE extends Comparable>  void order(TYPE d1, TYPE d2, TYPE d3){ 
        TYPE min = d1;
        if (d2.compareTo(d1) < 0) min = d2;
        if (d3.compareTo(min) < 0) min = d3;

        TYPE max = d1;
        if (d2.compareTo(d1) > 0) max = d2;
        if (d3.compareTo(max) > 0) max = d3;

        TYPE center = d1;
        // if ((d1.compareTo(d2) < 0 && d1.compareTo(d3) > 0 )|| (d1.compareTo(d2) > 0 && d1.compareTo(d3) < 0))
        //     center = d1;
        if ((d2.compareTo(d1) <= 0 && d2.compareTo(d3) >= 0 )|| (d2.compareTo(d1) >= 0 && d2.compareTo(d3) <= 0))
            center = d2;
        if ((d3.compareTo(d1) <= 0 && d3.compareTo(d2) >= 0 )|| (d3.compareTo(d1) >= 0 && d3.compareTo(d2) <= 0))
            center = d3;
        
        System.out.println(min + " " + center + " " + max);
    
    }

    public static <TYPE extends Comparable>  void reverseOrder(TYPE d1, TYPE d2, TYPE d3){ 
        TYPE min = d1;
        if (d2.compareTo(d1) < 0) min = d2;
        if (d3.compareTo(min) < 0) min = d3;

        TYPE max = d1;
        if (d2.compareTo(d1) > 0) max = d2;
        if (d3.compareTo(max) > 0) max = d3;

        TYPE center = d1;
        // if ((d1.compareTo(d2) < 0 && d1.compareTo(d3) > 0 )|| (d1.compareTo(d2) > 0 && d1.compareTo(d3) < 0))
        //     center = d1;
        if ((d2.compareTo(d1) <= 0 && d2.compareTo(d3) >= 0 )|| (d2.compareTo(d1) >= 0 && d2.compareTo(d3) <= 0))
            center = d2;
        if ((d3.compareTo(d1) <= 0 && d3.compareTo(d2) >= 0 )|| (d3.compareTo(d1) >= 0 && d3.compareTo(d2) <= 0))
            center = d3;
        
        System.out.println(max + " " + center + " " + min);
    }


    public static void main(String[] args) {
	Scanner read = new Scanner (System.in);
        int cmd = read.nextInt();
        switch (cmd) {
            case 1: getMin(read.nextInt(), read.nextInt(), read.nextInt());
                    getMin(read.next().charAt(0), read.next().charAt(0), read.next().charAt(0));
                    getMin(read.nextFloat(), read.nextFloat(), read.nextFloat());
                    break;
            case 2: getCenter(read.nextInt(), read.nextInt(), read.nextInt());
                    getCenter(read.next().charAt(0), read.next().charAt(0), read.next().charAt(0));
                    getCenter(read.nextFloat(), read.nextFloat(), read.nextFloat());
                    break;
            case 3: getMax(read.nextInt(), read.nextInt(), read.nextInt());
                    getMax(read.next().charAt(0), read.next().charAt(0), read.next().charAt(0));
                    getMax(read.nextFloat(), read.nextFloat(), read.nextFloat());
                    break;

            case 4: order(read.nextInt(), read.nextInt(), read.nextInt());
                    order(read.next().charAt(0), read.next().charAt(0), read.next().charAt(0));
                    order(read.nextFloat(), read.nextFloat(), read.nextFloat());
                    break;
            case 5: reverseOrder(read.nextInt(), read.nextInt(), read.nextInt());
                    reverseOrder(read.next().charAt(0), read.next().charAt(0), read.next().charAt(0));
                    reverseOrder(read.nextFloat(), read.nextFloat(), read.nextFloat());
                    break;
        }
    }
}

    