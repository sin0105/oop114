import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab07_2 {

    public static Scanner read = new Scanner(System.in);    

    public static void handleEmpMont(MonthlyEmployee empMonth [], int N){
        int sumSalary = 0, sumOverTime = 0, Total = 0;
		for (int i = 0; i < N; i++){
            empMonth[i] = new MonthlyEmployee();
            empMonth[i].setDataMon(read.next(), read.next(), read.nextInt(), read.nextInt());
            sumSalary += empMonth[i].getSalary();
            sumOverTime += empMonth[i].getSumOver();
            System.out.println(empMonth[i].toString());
            
        }
        Total = sumSalary + sumOverTime;
        System.out.println(sumSalary + "," + sumOverTime+ ","+ Total);
    }

    public static void handleEmpWeek(WeeklyEmployee empWeek [], int N){
        double sumSalary = 0, Total = 0;
        int sumOverTime = 0;
		for (int i = 0; i < N; i++){
            empWeek[i] = new WeeklyEmployee();
            empWeek[i].setDataWeek(read.next(), read.next(), read.nextInt(), read.nextInt(), read.nextInt(), read.nextInt());
            empWeek[i].calMoney();
            sumSalary += empWeek[i].getCommission();
            sumOverTime += empWeek[i].getSumWeek();
            System.out.println(empWeek[i].toString());
            
        }
        Total = sumSalary + sumOverTime;
        System.out.printf("%.2f,%d,%.2f\n",sumSalary, sumOverTime, Total);
    }

    public static void  handleEmpDay(DailyEmployee empDay [], int N){
        double sumSalary = 0, Total = 0;
        int sumOverTime = 0;
		for (int i = 0; i < N; i++){
            empDay[i] = new DailyEmployee();
            empDay[i].setDataDay(read.next(), read.next(), read.nextInt(), read.nextInt(), read.nextInt(), read.nextInt());
            empDay[i].calMoney();
            sumSalary += empDay[i].getCommission();
            sumOverTime += empDay[i].getSumDay();
            System.out.println(empDay[i].toString());
            
        }
        Total = sumSalary + sumOverTime;
        System.out.printf("%.2f,%d,%.2f",sumSalary, sumOverTime, Total);
    }

    public static void main(String[] args) {
	    int N = read.nextInt(); // number of monthly employees
        if (N > 0){
        	MonthlyEmployee [] empMonth = new MonthlyEmployee [N];
		    handleEmpMont(empMonth,  N);
        }

	    N = read.nextInt(); //number of weekly employees
        if (N > 0){
        	WeeklyEmployee [] empWeek = new WeeklyEmployee[N];
		    handleEmpWeek(empWeek,  N);
        }

        N = read.nextInt(); //number of daily employees
        if (N > 0){
        	DailyEmployee [] empDay = new DailyEmployee[N];
		    handleEmpDay(empDay,  N);
        }
    }
}

class Employee {
    protected String id, name;

    public String  toString() {
        return (id + "," + name + ",");
    }
}

class MonthlyEmployee  extends Employee  { 
    private int salary;
    private int overtime_period, sumOver;

    public void setDataMon(String i, String n, int s, int over) {
        id = i;
        name = n;
        salary = s;
        overtime_period = over;
        sumOver = overtime_period * 200;
    }

    @Override
    public String toString() {
        return (super.toString() + salary + "," + sumOver);
    }

    public int getSalary() {
        return salary;
    }
   
    public int getSumOver() {
        return sumOver;
    }
}

class  CommissionEmployee  extends Employee  {  
    protected int totalSale;
    protected double percentCommRate, monthlyWage, commission;
    protected DecimalFormat dec  = new DecimalFormat("0.00");
}


class  WeeklyEmployee  extends CommissionEmployee  {
    protected int weeklyRate, workingWeek;

    public void setDataWeek(String i, String n, int t, double per, int we, int wo) {
        id = i;
        name = n;
        totalSale = t;
        percentCommRate = per * 0.01;
        weeklyRate = we;
        workingWeek = wo;

    }

    public void calMoney() {
        commission = (double) (totalSale * percentCommRate);
        monthlyWage = (double) (commission + (weeklyRate * workingWeek));
    }

    public double getCommission() {
        return commission;
    }

    public double getSumWeek() {
        return weeklyRate * workingWeek;
    }

    @Override
    public String toString() {
        return (super.toString() + dec.format(commission)+ "," + (weeklyRate * workingWeek) + "," + dec.format(monthlyWage));
    }
}


class DailyEmployee extends CommissionEmployee {
    protected int dailyRate, workingDay;

    public void setDataDay(String i, String n, int t, double per, int da, int wo) {
        id = i;
        name = n;
        totalSale = t;
        percentCommRate = per * 0.01;
        dailyRate = da;
        workingDay = wo;

    }

    public void calMoney() {
        commission = (double) (totalSale * percentCommRate);
        monthlyWage = (double) (commission + (dailyRate * workingDay));
    }

    public double getCommission() {
        return commission;
    }

    public double getSumDay() {
        return dailyRate * workingDay;
    }

    @Override
    public String toString() {
        return (super.toString() + dec.format(commission)+ "," + (dailyRate * workingDay) + "," + dec.format(monthlyWage));
    }
}