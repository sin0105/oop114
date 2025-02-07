// package 204114.week02;
//670510702 Chonlanna Saikhampa
import java.util.*;
public class Lab02_3 {    
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int a1 = read.nextInt();
        int a2 = read.nextInt();
        int b1 = read.nextInt();
        int b2 = read.nextInt();
        int all = read.nextInt();

        int temp1,temp2, i, list[];

        list = new int[all*2];
        for(i=0;i<=(all*2)-1;i++){
            list[i] = read.nextInt();
        }

        if(a1 > b1 && a2 < b2){
            temp1 = a1;
            a1 = b1;
            b1 = temp1;

            temp2 = a2;
            a2 = b2;
            b2 = temp2;
        }

        if(a1 > b1 && a2 > b2){
            temp1 = a1;
            a1 = b1;
            b1 = temp1;
        }

        if(a1 < b1 && a2 < b2){
            temp2 = a2;
            a2 = b2;
            b2 = temp2;
        }
        checkBoundary(all, a1, a2, b1, b2, list);

    }
    
    private static void checkBoundary(int all,int a1, int a2, int b1, int b2, int[] list){
        int i, edge=0, in=0, out=0;

        for(i=0;i<=(all*2)-1;i+=2){
            if(list[i]<a1 || list[i]>b1 || list[i+1]>a2 || list[i+1]<b2)
                out ++ ;

            else if(list[i]>=a1 && list[i]<=b1 && list[i+1]==a2)
                edge ++ ;
            else if(list[i]>=a1 && list[i]<=b1 && list[i+1]==b2)
                edge ++ ;
            else if(list[i+1]<=a2 && list[i+1]>=b2 && list[i]==a1)
                edge ++ ;
            else if(list[i+1]<=a2 && list[i+1]>=b2 && list[i]==b1)
                edge ++ ;

            else
                in ++ ;
        }
        System.out.print(in + " " + edge + " " + out);
    }
    
}
