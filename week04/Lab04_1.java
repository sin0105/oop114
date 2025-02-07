// Chonlanna Saikhampa 
// 670510702
import java.util.*;
public class Lab04_1 {
    public static void main(String[] argss){
        Scanner read = new Scanner(System.in);
        Matrix matrix = new Matrix();       

	    int n = read.nextInt();	
	    matrix.setSize(n);	
        int i, j;
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j) {
                matrix.setMatrix(i,j,read.nextInt());
            }
        }

        matrix.checkMatrix();
	    System.out.println(matrix.getType());
    }
}

class Matrix {
    private int size;
    private int[][] matrix;
    private char type;

    public void setSize(int n) {
        size = n;
        matrix = new int[n][n];
    }
    public void setMatrix(int i, int j, int data){
	    matrix [i][j] = data;

    }
    public void checkMatrix() {
        int i,j;
        boolean check1 = true, check2 = true, check3 = true, check4 = true;

        for (i = 0; i < size; ++i) {
            for (j = 0; j < size; ++j) {
                if (i == j && matrix[i][j] != 1){
                    check1 = false;
                }
                if  (i != j && matrix[i][j] != 0){
                    check2 = false;
                }
                if (j < i && matrix[i][j] != 0){
                    check3 = false;
                }
                if (j > i && matrix[i][j] != 0){
                    check4 = false;
                }
            }    
        }

        if (check1 == true && check2 == true)
            type = 'I';
        else if (check3 == true && check4 == false)
            type = 'U';
        else if (check3 == false && check4 == true)
            type = 'L';
        else
            type = 'O';
    }

    public char getType() {
	    return type;
    }
}
