//Chonlanna Saikhampa
//670510702

import java.util.Scanner;
public class Lab10_3 { 
    public static Scanner read = new Scanner (System.in);

    private static void doneChar(){
        int num;
        MyList <Character> objC = new MyList();
        do {
            num = read.nextInt();
                if (num == 1) objC.insertFirst(read.next().charAt(0));
                if (num == 2) objC.removeFirst();
                if (num == 3) System.out.println( objC.getFirst());
                if (num == 4) System.out.println(objC.getSize());
                if (num == 5) objC.reverse();
                if (num == 6) objC.show();
            } while (num != 7 );
    }  
    private static void doneInt(){
        int num;
        MyList <Integer> objI = new MyList();
        do {
            num = read.nextInt();
                if (num == 1) objI.insertFirst(read.nextInt());
                if (num == 2) objI.removeFirst();
                if (num == 3) System.out.println( objI.getFirst());
                if (num == 4) System.out.println(objI.getSize());
                if (num == 5) objI.reverse();
                if (num == 6) objI.show();
            } while (num != 7 );
       
    }  
    public static void main(String[] args) {  
 
        char Type  = read.next().toUpperCase().charAt(0);
        if (Type == 'C'){
            doneChar();
        }
        else
            doneInt();   
    }
}

class MyList <TYPE>{
    class Node<TYPE>{
        private TYPE item;
        private Node next;

	    public Node(TYPE item) {
            this.item = item;
            next = null;
	    }
    }

    private Node firstPtr;
    private int count;
   
    public MyList(){ 
      	this.firstPtr = null;
    }

    public boolean isEmpty(){ 
        return (count == 0);
    }

     public int getSize(){ 
        return count;
    }

    public void insertFirst(TYPE  v){         
        count ++;
        Node newNode = new Node(v);
	    newNode.next = firstPtr;
        firstPtr = newNode;
    }
   

    public TYPE getFirst()  {  
        if (!isEmpty()){
            return (TYPE)firstPtr.item;   
        }
        return null;
    } 

    public void removeFirst()  {  
        if (!isEmpty()){
            firstPtr = firstPtr.next;
            count--;
        }
    }

    public void reverse()  {  
        if (!isEmpty()){
            MyList <TYPE>  newList = new MyList();
            Node cur = firstPtr;
            while(cur != null){
                newList.insertFirst((TYPE)cur.item);
                cur = cur.next;
            }
            firstPtr = newList.firstPtr;
        }
    }

    public void show(){
        if (!isEmpty()) {
            Node nod = firstPtr;
            for (int i = 0; i < count; i++) {
                System.out.print(nod.item + " ");
                nod = nod.next;
            }
            System.out.println();
        }
        
        else System.out.println("empty");
    }
}