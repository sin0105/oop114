// Chonlanna Saikhampa 
// 670510702

import  java.util.*;
public class Lab04_4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();

        Word text = new Word();
        text.setWord(name);
        text.setMinus();
        text.setList();
        text.setChange();
        text.setCharp();
        text.printWord();
    }
}

class Word {
    private String name;
    private int size, minus, i;
    private char list[];               
    private char pluslist[];  

    public void setWord(String name) {
        name = name.replace('x','>'); // '>'(62) -> 'A'(65)
        name = name.replace('y','?'); // '>'(63) -> 'B'(66)
        name = name.replace('z','@'); // '>'(64) -> 'C'(67)
        name = name.toUpperCase();
        this.name = name;
        size = name.length();
    }

    public void setMinus() {
        if (size % 3 != 0){
            minus = size % 3;
            minus = 3 - minus;
        }
        else
            minus = 0;
    }

    public void setList() {
        list = new char[size];
        for (i = 0; i < (size); i++){
            list[i] = name.charAt(i) ;
            list[i] = (char)((int) list[i] + 3);
        }
    }

    public void setChange() {
        pluslist = new char[size + minus];
        for (int i = 0; i <size; i++){
            pluslist[i] = list[i];
        }
    }

    public void setCharp() {
        for (int i = size; i < (size + minus); i++){
            pluslist[i] = '#';
        }
    }

    public void printWord() {
        for (int i=0;i<(size+minus);i++){
            if (i % 3 == 0 && i != 0)
                System.out.print(" " + pluslist[i]);
            else
                System.out.print(pluslist[i]);
        }
    }
}