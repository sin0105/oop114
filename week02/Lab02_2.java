//670510702 Chonlanna Saikhampa
import java.util.*;
public class  Lab02_2 {
     public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        checkOddEven(num);
        checkPrime(num);
     }

    private static void checkOddEven(int num){
        if(num % 2 == 1)
            System.out.print("odd");
        else 
            System.out.print("even");
           
    }

     private static void checkPrime(int num){
        int j, sum=0;
        System.out.println();
            for(j=2;j<=num;j++){
                if(num % j == 0)
                    sum+=1;
                else
                    sum+=0;
            } 
            
            if(num==1)
                System.out.print("not prime");
            else if(sum==0 || sum==1)
                System.out.print("prime");
            else
                System.out.print("not prime");
        
     }

}