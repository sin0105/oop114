import java.util.Scanner;
public class Lab00{
    public static void main(String[] args){
        int a,b,sum,i;
        Scanner read = new Scanner(System.in);
        for(i=1;i<=5;i++){
            a = read.nextInt();
            b = read.nextInt();
            sum = a + b;
            System.out.println(sum + " ");
        }
    }
}