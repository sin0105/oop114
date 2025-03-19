//Chonlanna Saikhampa
//670510702

import java.util.*;
public class Lab10_2 {
    static Scanner in = new Scanner (System.in); 
    public static void main(String[] args) {  
        int maxSize = in.nextInt();
        char Type  = in.next().charAt(0);
        int  num;
        if (Type == 'C'){
            curQueue <Character> objC = new curQueue(maxSize);
            
            do {
                num = in.nextInt();
                if (num == 1) objC.enqueue(in.next().charAt(0));
                if (num == 2) System.out.println( objC.dequeue());
                if (num == 3) objC.show();
            } while (num != 4 );
        }
        else{
            curQueue <Integer> objI = new curQueue(maxSize);
            do {
                num = in.nextInt();
                if (num == 1) objI.enqueue(in.nextInt());
                if (num == 2) System.out.println(objI.dequeue());
                if (num == 3) objI.show();
            } while (num != 4 );
        }

    }
}
class curQueue<TYPE>  {
    private final Object [] item;
    private int maxSize, front, rear, count;


    curQueue (int n ) { //constructor for creating circular queue
        this.maxSize = n;
        this.item  = new Object[n];
        this.front=0;
        this.rear= n-1;
        this.count=0;
    }

    private boolean isEmpty(){ 
        if (count == 0) return true;
        else return false;
    } 

    private boolean isFull(){ 
        if (count == maxSize) return true;
        else return false;
    } 

    public void enqueue(TYPE  v) {         
        if (isFull()) 
            System.out.println("full");
        else {   
            rear = (rear+1) % maxSize;
            item[rear] = v;
            count++; 
        }
    }
    
    public TYPE dequeue()  {  
        if (!isEmpty()){
            Object queueFront = item[front];
            front = (front + 1) % maxSize;
            count--;
            return (TYPE)queueFront;   
        }
        return null;
    }

    public void show() {
        if (isEmpty()) 
            System.out.println("empty");
        else {
            boolean stop = false;
            for (int i = front; ! stop; i = (i + 1)% maxSize) {
                System.out.print(item[i] + " ");
                if (i == rear) stop = true;
            }
            System.out.println();
        }
    }
}

