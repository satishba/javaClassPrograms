package javaClassPrograms.unit2;

import java.util.Scanner;

class Student{

    int usn;
    char sem;
    void welcome(){
        System.out.println("Welcome to EEE Dept");
    }

    public void setSem() {
        Scanner sc  = new Scanner(System.in);
        this.sem=sc.next().charAt(0);
    }

    public void setUsn(int usn) {
        Scanner sc  = new Scanner(System.in);
        this.usn=sc.nextInt();

    }

    public char getSem() {
        return sem;
    }

    public int getUsn() {
        return usn;
    }
}


public class basicEEEDept {
    public static void main(String[] args) {
        Student eeeStudent1,eeeStudent2,eeeStudent3;
        eeeStudent1 = new Student();
        char sem;
        Scanner sc = new Scanner(System.in);
        sem=sc.next().charAt(0);

        eeeStudent1.setSem();
        int usn;
        usn = sc.nextInt();
        eeeStudent1.setUsn(usn);
        System.out.println(eeeStudent1.getSem());
        System.out.println(eeeStudent1.getUsn());


    }
}

