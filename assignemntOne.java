

import java.util.Scanner;

class Student{

    int usn;
    char sem;
    int marks[] = new int[6];

//    <TO DO:Add Constructor to initialize sem and usn>

    Student(int usn,char sem){
        this.usn=usn;
        this.sem=sem;
    }

//    <TO DO : Add constructor with no intializations>

    Student(){
        int usn=this.usn;
        int sem=this.sem;
    }

    public void setSem() {
        Scanner sc  = new Scanner(System.in);
        this.sem=sc.next().charAt(0);
    }
    public void setUsn(int usn) {
        Scanner sc  = new Scanner(System.in);
        this.usn=sc.nextInt();

    }

//  <TO DO : ADD METHOD TO SET MARKS>

    public void marks(){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
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
    <TO DO: Add a method to find maximum marks>

}


public class assignemntOne {
    public static void main(String[] args) {
    Student eeeStudent1 = new Student();
    int usn;
    int sem;
    Student eeeStudent2 = new Student(usn,sem);


//    <TO DO: Assign marks to students>

        eeeStudent1.marks();
        eeeStudent2.marks();

//    <TO DO: Print the max marks of both students>
        eeeStudent1.marks();
        int[] arr=new int[6];
        int max1=arr[0];
        for(int i=0;i<8;i++){
            if(arr[i]>max1)
                max1=arr[i];
        }
        System.out.println(max1);

        eeeStudent2.marks();
        int max2=arr[0];
        for(int i=0;i<8;i++){
            if(arr[i]>max2)
                max2=arr[i];
        }
        System.out.println(max2);

//     <TO DO: Take input of a subject index from user and print
//     which student has more marks in that subject>

        char[] sub=new char[6];
        Scanner sc = new Scanner(System.in);
        char index = sc.next().charAt(0);
            if(index==char[i]){
                if(eeeStudent1.marks() > eeeStudent2.marks())
                    System.out.println("maxm marks in that sub is:"+eeeStudent1.marks());
                else
                    System.out.println(eeeStudent2.marks());
        }
    }
}

