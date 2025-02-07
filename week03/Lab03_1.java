// 670610702 Chonlanna Saikhampa
import java.util.*;
public class Lab03_1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char sex = read.next().charAt(0);
        float weight = Float.parseFloat(read.next());
        int height = read.nextInt();
        
        Person person = new Person();
        person.setHeight(height);
        person.setWeight(weight);
        person.setSex(sex);

        if (person.getSex() == 'm') 
            System.out.print("Male ");
        else
            System.out.print("Female ");
        
        if (person.isShapeOK())
            System.out.print("OK");
        else 
            System.out.print("not OK");

    }
}

class Person {
    private char sex;
    private float weight;
    private int height;

    public boolean isShapeOK() {
        if ((sex == 'm') && (weight <= height - 100))
                return true;
        else
            if ((sex == 'f') && (weight <= height - 110))
                return true;
        else
            return false;
    }

    public void setHeight(int height){
        this.height = height;
    } 
    public void setWeight(float weight){
        this.weight = weight;
    }
    public void setSex(char sex){
        this.sex  = Character.toLowerCase(sex);
    }
    public char getSex(){
        return Character.toLowerCase(sex);
    }
}
