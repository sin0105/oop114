import java.util.Scanner;
public class Lab10_2 {
    static Scanner in = new Scanner (System.in); 
    public static void main(String[] args) {  
        int maxSize = in.nextInt();
        char Type  = in.next().charAt(0);
        if (Type == 'C'){
            //insert code here


        }
        else{
            //insert code here


        }

    }
}
class curQueue<TYPE>  {
    // member data
    private final Object [] item;
    //insert code here
   


    curQueue (int n ) { //constructor for creating circular queue
        this.maxSize = n;
        this.item  = new Object[n];
        this.front=0;
        this.rear= n-1;
        this.count=0;
    }
    // member methods
    private boolean isEmpty(){ 
        //insert code here



    }// end isEmpty()  

    public void enqueue(TYPE  v) {         
        if (isFull()) 
            System.out.println("full");
        else {   
            rear = (rear+1) % maxSize;
            item[rear] = v;
            count++; 
        }
    }// end enqueue()  
    
    public TYPE dequeue()  {  
        if (!isEmpty()){
            Object queueFront = item[front];
            front = (front + 1) % maxSize;
            count--;
            return (TYPE)queueFront;   
        }
        return null;
    }// end dequeue()  

    //insert code here








}//end class CirQueue

