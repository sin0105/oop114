import java.util.Scanner;
public class Lab01_1 {
    public static void main(String[] args){
        int a,b,c,sum, count = 2,temp;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();

        if(a > b){
            temp = b;
            b = a;
            a = temp;
        }
        System.out.print(a + " " + b + " ");
        sum = (a*2) + (b+1);
        while(sum <= c){
            System.out.print(sum + " ");
            count++;
            a = b;
            b = sum;
            sum = (a*2) + (b+1);
        }
        System.out.print("\n"+count);
    }
}
