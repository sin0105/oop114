// 670610702 
//Chonlanna Saikhampa

import java.util.*;
public class Lab06_5 {
    public static void checkAndPrintVote(Star[] Mst, Star[] Fst, int allP, Voter[] vt) {
        String check_Mname = Mst[0].getName();
        int i;
        int maxM = Mst[0].getVote();
        int idM = Mst[0].getNo();
        for (i = 1; i < 3; i++) {
            if (Mst[i].getVote() > maxM) {
                maxM = Mst[i].getVote(); 
                idM = Mst[i].getNo();
                check_Mname = Mst[i].getName();
            }
        }
        System.out.print(check_Mname + " ");

        String check_Fname = Fst[0].getName();
        int maxF = Fst[0].getVote();
        int idF = Mst[0].getNo();
        for (i = 1; i < 3; i++) {
            if (Fst[i].getVote() > maxF) {
                maxF = Fst[i].getVote(); 
                idF = Mst[i].getNo();
                check_Fname = Fst[i].getName();
            }
        }
        System.out.print(check_Fname);
        printGoodLuckPeople(allP, vt, idM, idF);
    }

    public static void printGoodLuckPeople(int allP, Voter[] vt,int idM ,int idF) {
        System.out.println();
        int i;
        for (i = 0; i < allP; i++) {
            if (vt[i].getMaleNo() == idM) 
                if (vt[i].getFemaleNo() == idF)
                    System.out.print(vt[i].getName() + ' ');
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int allP = read.nextInt();
        int i, v = 0;

        Star[] Mst = new Star[3];
        Star[] Fst = new Star[3];
        String Mname[] = {"Nadech", "Wier", "Mario"};
        String Fname[] = {"Aum", "Yaya", "Bella"};
        
        for (i = 0; i< 3; i++) {
            Mst[i]= new Star();
            Mst[i].setDataS(i+1, Mname[i], v);
        }

        for (i = 0; i< 3; i++) {
            Fst[i]= new Star();
            Fst[i].setDataS(i+1, Fname[i], v);
        }

        Voter[] vt = new Voter[allP];
        for (i = 0; i< allP; i++) {
            vt[i] = new Voter();
            vt[i].setDataV(read.next(), read.nextInt(), read.nextInt());
            int checkMale = vt[i].getMaleNo();
            int checkFemale = vt[i].getFemaleNo();

            switch (checkMale) {
            case 1:
                Mst[0].score();
                break;
            case 2:
                Mst[1].score();
                break;
            case 3:
                Mst[2].score();
                break;
            }

            switch (checkFemale) {
                case 1:
                    Fst[0].score();
                    break;
                case 2:
                    Fst[1].score();
                    break;
                case 3:
                    Fst[2].score();
                    break;
            }

        }
        checkAndPrintVote(Mst, Fst, allP, vt);
    }
}

class Star {
    private String name;
    private int no, vote;

    public void setDataS(int No, String N, int V) {
        no = No;
        name = N;
        vote = V;
    }
    public void score() {
        vote ++;
    }

    public int getVote() {
        return vote;
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }
} 

class Voter {
    private String name;
    private int maleNo, femaleNo;

    public void setDataV(String N, int M, int F) {
        name = N;
        maleNo = M;
        femaleNo = F;
    }

    public void printVoter() {
        System.out.print(name);
    }

    public String getName() {
        return name;
    }

    public int getMaleNo() {
        return maleNo;
    }

    public int getFemaleNo() {
        return femaleNo;
    }

}