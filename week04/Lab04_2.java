// Chonlanna Saikhampa 
// 670510702

import java.util.*;
public class Lab04_2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        Tong matrix = new Tong();
        matrix.setSize(num);
        int i,j;
        for (i = 0; i < num; i++){
            for (j = 0; j < num; j++){
                matrix.setMatrix(i, j, read.nextInt());
            }
        }
        matrix.checkNumber();
    }
}

class Tong{
    private int size;
    private int matrix[][];
    private int sum = 0;

    public void setSize(int num) {
        size = num;
        matrix = new int[num][num];
    }

    public void setMatrix(int i, int j, int data){
        matrix[i][j] = data;
    }

    public void checkNumber(){
        int i,j;
        for (i = 0; i < size; i++){
            for (j = 0; j < size; j++){
                if (i == 0 || i == (size-1) || i == j || i + j == (size-1) || j == 0 || j == (size-1)){
                    if (matrix[i][j] >= 111 && matrix[i][j] <=999 && matrix[i][j] % 111 == 0){
                        System.out.print(matrix[i][j] + " ");
                        sum ++;
                    }
                } 
            }
        }
        if (sum == 0)
            System.out.print("No");
    }
    
}