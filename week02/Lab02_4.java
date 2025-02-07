//670510702 Chonlanna Saikhampa
import java.util.*;
public class Lab02_4 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args){
        
        int a = read.nextInt();
        int b = read.nextInt();
        int listA[], listB[];
        listA = getData(a);
        listB = getData(b);
        findAinB(a, b, listA, listB);
        int max = listA[0];
        for(int num : listA){
            max = Math.max(max, num);
        }
        System.out.println();
        System.out.print(max);

    }
        
    private static int[] getData(int num){
        int i, list[];
        list = new int[num];
        for(i=0;i<=num-1;i++){
            list[i] = read.nextInt();
        }
        return list;
    }

    private static void findAinB(int a, int b, int[] listA, int[] listB){
        int i, j, count=0;
        
        for(i=0;i<=a-1;i++){
            for(j=0;j<=b-1;j++){
                if(listA[i] == listB[j])
                count++;
            }
            System.out.print(count + " ");
            count = 0;
        }
        
    }  
}
 