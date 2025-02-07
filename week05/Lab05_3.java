// 670610702 
//Chonlanna Saikhampa

import java.util.*;

public class Lab05_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int all = read.nextInt();
        int num;

        Stack st = new Stack(all);
        st.isEmpty();
        st.isFull();

        do {
            num = read.nextInt();
            if (num == 1) st.push(read.nextInt());
            if (num == 2) st.pop();
            if (num == 3) st.getTop();
            if (num == 4) System.out.println(st.getSize());
            if (num == 5) st.show();
        } while (num != 6 );
    }
}

class Stack {
    private int maxSize;
    private int item[];
    private int top;

    public Stack(int maxSize) {
        top = -1;
        this.maxSize = maxSize;
        item = new int[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }

    public void push(int x) {
        if (!isFull())
            item[++top] = x;
        else
            System.out.println("full");
    }

    public void pop() {
        if (!isEmpty())
            System.out.println("pop" + " " + item[top--]);
        else
            System.out.println("empty");
    }

    public void getTop() {
        if (!isEmpty())
            System.out.println(item[top]);
        else 
            System.out.println("empty");
    }

    public int getSize() {
        return top + 1;
    }

    public void show() {
        if (!isEmpty()){
            for(int i=0;i<=top;i++)
                System.out.print(item[i] + " ");
            System.out.println();
        }
        else
            System.out.println("empty");
    }
        
}
