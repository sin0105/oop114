// Chonlanna Saikhampa
// 670510702
import java.util.Scanner;

public class Lab09_2 {
    public static void show2(Shape2Dim obj [], int M){
        System.out.println("Rhombus");
        for(int i = 0; i < M; i++) {
            if(obj[i] instanceof Rhombus){
                obj[i].draw();
            }
        }

        System.out.println("Square");
        for(int i = 0; i < M; i++) {
            if(obj[i] instanceof Square){
                obj[i].draw();
            }
        }

        System.out.println("Triangle");
        for(int i = 0; i < M; i++) {
            if(obj[i] instanceof Triangle){
                obj[i].draw();
            }
        }
        
        
    }
    public static void show1(Shape2Dim obj [], int M){
        for(int i = 0; i < M; i++) {
            obj[i].draw();
        }

    }
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int M,N;
        char ch;

        char symbol = read.next().charAt(0);
        M = read.nextInt();
        
        Shape2Dim[] obj = new Shape2Dim[M];
        for (int i = 0; i < M; i++){   
            ch = read.next().charAt(0);
            N = read.nextInt();

            if (ch == 'S') {
                obj[i] = new Square();
                obj[i].setData(symbol, N);
                
            }
            else if (ch == 'T') {
                obj[i] = new Triangle();
                obj[i].setData(symbol, N);
            }

            else {
                obj[i] = new Rhombus();
                obj[i].setData(symbol, N);
            }
        }
        
        int show_type = read.nextInt();
        if (show_type == 1)
            show1(obj,M);
        else
            show2(obj,M);

    }
}
abstract class Shape2Dim {
    protected int N;
    protected char symbol;
    public abstract void draw();

    public void setData(char s, int n) {
        symbol = s;
        N = n;
    }
}

class Rhombus extends Shape2Dim {
    @Override
    public void draw(){
        if (N > 0) {
            int i;

            String fsq = "%" + N + "c\n";
            String fsq2;
            System.out.printf(fsq,symbol);

            for (i = 1; i< N; i++ ){
                fsq2 = "%" + (N-i)  +  "c%" + (2*i)  + "c\n";
		        System.out.printf(fsq2,symbol,symbol);
            }

	    for (i=N-2; i>=1;i-- ){
            fsq2 = "%" + (N-i) + "c%" + (2*i) + "c\n";
            System.out.printf(fsq2,symbol,symbol);
	    }

	    System.out.printf(fsq,symbol);
	    }
    }
}

class Triangle extends Shape2Dim{
    @Override
    public void draw(){
        if (N == 1) {
            System.out.println(symbol);
        }
        else if (N == 2) {
            System.out.println(" " + symbol + " ");
            System.out.printf("%c%c%c\n",symbol,symbol,symbol);
        }
        else if (N != 2) {
            int i;

            String fsq = "%" + N + "c\n";
            String fsq2;
            System.out.printf(fsq,symbol);

            for (i = 1; i< N-1; i++ ){
                fsq2 = "%" + (N-i)  +  "c%" + (2*i)  + "c\n";
		        System.out.printf(fsq2,symbol,symbol);
                if (i == N-2)
                    for (int j = 0; j < (N*2)-1; j++)
                        System.out.print(symbol);
            }
            System.out.println();
        }
    } 
}

class Square  extends Shape2Dim{
    @Override
    public void draw(){
        for (int i = 0; i < N; i++) {
        if (i == 0 || i == N-1) {
            for (int j = 0; j < N; j++){
                System.out.print(symbol);
            }
        }
        else {
            for (int j = 0; j < N; j++) {
                if (j == 0 || j == N-1)
                    System.out.print(symbol);
            
                else 
                    System.out.print(" " );
            }
        }
        System.out.println();
        }
        
    }
}