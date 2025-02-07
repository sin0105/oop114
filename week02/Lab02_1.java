//670510702 Chonlanna Saikhampa
import java.util.Scanner;
public class  Lab02_1 { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char mode = sc.next().charAt(0);
        char symb = sc.next().charAt(0);
        int n = sc.nextInt();

        if(Character.isLowerCase(mode))
                printStartDown(n, symb);
        else if(Character.isUpperCase(mode))
                printStartUp(n, symb);
        else 
                printStartBoth(n, symb);
    }

    private static void printStartDown(int n , char symb) {	
        int row, col;
        for(row=n;row>=1;row--){
            for(col=1;col<=row;col++){
                System.out.print(symb);
            }
            System.out.println();
        }
    }

    private static void printStartUp(int n,char symb) {
        int row, col;
        for(row=1;row<=n;row++){
            for(col=n-row;col>=1;col--){
                System.out.print(" ");
            }
            for(col=1;col<=row;col++){
                System.out.print(symb);
            }
            System.out.println();
        }
    }

    private static void printStartBoth(int n,char symb) {
        printStartUp(n, symb);
        printStartDown(n-1, symb);
    }

}