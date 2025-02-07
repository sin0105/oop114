import java.util.*;
public class Lab01_2 {
    public static void main(String[] args){
        int num,sum=0,count=0;
        Scanner read = new Scanner(System.in);
        num = read.nextInt();
        
        while(num >= 5){
            
            sum += num - (num % 5);
            num = (((int) num/5)*2) + (num % 5);
            count++;
        }
        sum += num;
        System.out.print(sum + " ");
        System.out.print(count + " ");
        System.out.print(num);
    }
}