package unit2;

import java.util.Scanner;

class Student{

    int usn;
    char sem;
    int marks[] = new int[8];
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

    public void setMarks() {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public char getSem() {
        return sem;
    }

    public int getUsn() {
        return usn;
    }

    void display(){
        System.out.println("Welcom to "+ this.usn);
    }

    void display(int usn){
        for(int x:marks){
            System.out.println(x);
        }
    }

    void display(int usn,int test){

    }


    void compare(Student temp){
        float average1=0.0f,average2=0.0f;
        for(int x:marks){
            average1=average1+x;
        }
        average1=average1/8;

        for(int x:temp.marks){
            average2=average2+x;

        }

        average2=average2/8;

    }
}
/*class Semester {
    char sem;
    int subjects;
}*/
class StudentWithMakrs{
    int usn;
    char sem;
    int  marks[] = new int[10];

    public void setMarks() {
        for(int i=0;i<8;i++){
            //this.marks[i]=input.nextInt();
        }
    }

    public void setUsn(int usn) {
        usn=usn+1;
        this.usn = usn;
    }

    public void setSem(char sem) {
        this.sem = sem;
    }

    public int[] getMarks() {
        return marks;
    }
}

public class basicEEEDept {
    public static void main(String[] args) {
        StudentWithMakrs eeeStudent1;
        eeeStudent1 = new StudentWithMakrs();
        Scanner input = new Scanner(System.in);
        int marks[]  = new int[6];
        int i=0;
        for(int x:marks){
            marks[i++]=input.nextInt();
        }
       // eeeStudent1.setMarks(marks);



        Student eeeStudent2 = new Student();
        eeeStudent2.setUsn(10);
        eeeStudent2.setSem();
        Scanner input1 = new Scanner(System.in);

        eeeStudent2.setMarks();

        Student eeeStudent3 = new Student();
        int usn=10;
        eeeStudent2.setUsn(usn);
        eeeStudent2.setSem();
        eeeStudent3.setMarks();

        eeeStudent2.compare(eeeStudent3);





    }
}

