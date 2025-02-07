import java.util.*;
public class Lab01_3 {
    public static void main(String[] args) {

        int all, less, list[], i, count1=0, count2=0;
        Scanner read = new Scanner(System.in);

        all = read.nextInt();
        list = new int[all];

        for(i=0;i<=all-1;i++) {
            list[i] = read.nextInt();
        }

        less = read.nextInt();
        for (i=0; i<=all-1; i++) {
            if(list[i] >= less){
                count1++;
                System.out.print(list[i] + " "); //มาก
            }

        }
        if (count1 == 0) {
            System.out.print("-");            //ไม่มี
        }

        System.out.print("\n");

        for (i=0; i<=all-1; i++) {
            if(list[i] < less){
                count2++;
                System.out.print(list[i] + " "); //น้อย
            }

        }    
        if(count2 == 0){
            System.out.print("-");             //ไม่มี  
        }

    }

}
