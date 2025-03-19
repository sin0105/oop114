import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab07_1 { 
    public static void printAllStudents(Student [] stu,int num_s) {
        System.out.println("Student");
        for (int i = 0; i < num_s; i++) {
            System.out.println((i+1) + ")" + stu[i].printData());
        }
    }
    
    public static void printAllTeachers(Teacher [] teacher,int num_t) {
        System.out.println("Teacher");
        for (int i = 0; i < num_t; i++) { 
            System.out.println((i+1) + ")" + teacher[i].printData());
        }

    }
    public static void calAndPrintAvgAge(Student [] stu,int num_s,Teacher [] teacher,int num_t){
        DecimalFormat df = new DecimalFormat("0.00");
        int i, sum_s = 0, sum_t = 0, less = 0;
        double avg_s = 0, avg_t = 0;
        
        for (i = 0; i < num_s; i++) {
            sum_s += stu[i].getAge();
        }
        for (i = 0; i < num_t; i++) {
            sum_t += teacher[i].getAge();
        }
        
       if (num_s != 0  )avg_s = ((double)sum_s/num_s);
       if (num_t != 0 ) avg_t = ((double)sum_t/num_t);
        
        for (i = 0; i < num_t; i++) {
            if (teacher[i].getAge() < avg_t)
                less++;
        }
        System.out.println(df.format(avg_s) + " " + df.format(avg_t));
        System.out.print(less);
        
     
    }
  
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Student [] stu = new Student[N];
        Teacher [] teacher = new Teacher[N];
        String perName;
        int i,is=0,it=0,age;

        char type;
        for (i=0;i< N;i++){

            type = input.next().charAt(0);
            type = Character.toLowerCase(type);
            
            perName = input.next();
            age = input.nextInt();
            if (type == 't'){
                teacher[it] = new Teacher(perName,age,input.nextInt());
                it++;
            }
            else{
                stu[is] = new Student(perName,age,input.nextInt());
                is++;
            }
        }
	 
        printAllStudents(stu,is);
        printAllTeachers(teacher,it);
        calAndPrintAvgAge(stu,is,teacher,it );
    }
}

class Person {
    protected String perName;
    protected int age;
    
    // to Override
    public String printData() {
        return(perName + " " + age);
    }
    
    public int getAge() {
        return age;
    }

}

class Student  extends Person  {  
    private int level;
    
    public Student(String perName, int age, int level) {
        this.perName = perName;
        this.age = age;
        this.level = level;
    }
    
    @Override
    public String printData() {
        return(super.printData() + " " + level);
    }
    
   
}
class Teacher  extends Person  { 
    private int salary;
    
    public Teacher(String perName, int age, int salary) {
        this.perName = perName;
        this.age = age;
        this.salary = salary;
    }
    
    @Override
    public String printData() {
        return(super.printData() + " " + salary);
    }

}