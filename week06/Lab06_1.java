// 670610702 
//Chonlanna Saikhampa

import java.util.Scanner;
public class Lab06_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        char symbolX= read.next().trim().charAt(0);
	    char type = read.next().trim().charAt(0);

        Triangle myTriangle = new Triangle(num);
        myTriangle.draw();
        myTriangle.draw(symbolX);
        myTriangle.draw(symbolX, type);
    }
}
class Triangle{	
    private int num;
    private char symbolX;
    private char type;
    
	
    public Triangle(int N){
        num = N;
    }

    void draw(){
        int row, col;
        for(row = 1; row <= num; row++){
            for(col = 1; col <= row; col++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
    void draw(char X){
        int row, col;
        for(row = 1; row <= num; row++){
            for(col = 1; col <= row; col++){
                System.out.print(X);
            }
            System.out.println();
        }
    }

    void draw(char X, char Type) {
        int row, col;
        if (Type == 'R'){
            for(row = 1; row <= num; row++){
                for(col = num-row; col >= 1; col--){
                    System.out.print(" ");
                }
                for(col = 1; col <= row; col++){
                    System.out.print(X);
                }
                System.out.println();
            }
        }
        else {
            for(row = 1; row <= num; row++){
                for(col = num-row; col >= 0; col--){
                    System.out.print(X);
                }
                for(col = 1; col <= row; col++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }
}
