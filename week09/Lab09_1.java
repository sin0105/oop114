// Chonlanna Saikhampa
// 670510702
import java.util.Scanner;
public class Lab09_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] std = new Student[250];
        int id = 0;
        char choice;
        String name = new String();
        int mid,fin;
        do{
            choice = in.next().charAt(0);
            choice = Character.toLowerCase(choice);
     
            name = in.next();
            mid = in.nextInt();
            fin = in.nextInt();
            int sproj_npub = in.nextInt(); //proj score  or num of publications
            if (choice == 'u') {
                std[id] = new Undergraduate_Student();
                std[id].setInfo(name, mid, fin);
 	            ((Undergraduate_Student)std[id]).setProjectScore(sproj_npub); // type casting 
		  
            } else if (choice == 'g') {
                std[id] = new Graduate_Student();
                std[id].setInfo(name, mid, fin);
                ((Graduate_Student) std[id]).setPublication(sproj_npub); // type casting 
  	  
            }	           
            choice = in.next().charAt(0);
            choice = Character.toLowerCase(choice);
            id++;
     
        }
        while(choice == 'y');

        reportGrade(std, id);
    }

    public static void reportGrade(Student[] std, int n) {
		int num_S = 0;
        char result;
        for (int i = 0; i < n; i++) {
            result = std[i].calGrade();		
            System.out.println(std[i].getName() + " : " + result   );	
            if (result == 'S') 
                num_S ++;	
        }

        System.out.println("U = "+ (n - num_S)+ "\nS = "+ num_S);
    }
}
abstract class Student{ // abstract
    protected String name;
    protected int midtermScore;
    protected int finalScore;

    public void setInfo(String name ,int mid, int fin) {
        this.name = name;
        this.midtermScore = mid;
        this.finalScore = fin;
    }

    public String getName()  { return name; }
    public abstract char calGrade();
}

class Undergraduate_Student extends Student {
    private int projectScore;

    public void setProjectScore(int n) {
        projectScore = n;
    }

    public int getProjectScore() { 
        return projectScore; 
    }

    @Override
    public char calGrade(){  
        if ((midtermScore + finalScore) >= 50 && projectScore >= 50)
        return 'S';
            else 
        return 'U';
    }
    
}

class Graduate_Student extends Student {
    private int publicationNo;
	
    public void setPublication(int n) {
        publicationNo = n;
    }

    @Override
    public char calGrade(){  
        if ((midtermScore + finalScore) >= 60 && publicationNo >= 2)
        return 'S';
            else 
        return 'U';
    }
    
}

