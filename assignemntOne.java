

import java.util.Scanner;

class Student{

    int usn;
    char sem;
    int marks[] = new int[10];
    <TO DO:Add Constructor to initialize sem and usn>
        Student(int usn,char sem){
        this.usn = usn;
        this.sem = sem;
    }
    
    <TO DO : Add constructor with no intializations>
    Student(){
    }
    
    public void setSem() {
        Scanner sc  = new Scanner(System.in);
        this.sem=sc.next().charAt(0);
    }
    public void setUsn(int usn) {
        Scanner sc  = new Scanner(System.in);
        this.usn=sc.nextInt();

    }

<TO DO : ADD METHOD TO SET MARKS>
    
    public setMarks(int []marks){
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
    
    <TO DO: Add a method to find maximum marks>
        
    public int max_Marks{
    int temp=0;
        for(int x:marks){
            if(x>temp){
                temp=x;
            }
        }
        return temp;
    }

}


public class assignemntOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    Student eeeStudent1 = new Student();
    int usn = 91;
    char sem = 'V';
    Student eeeStudent2 = new Student(usn,sem);
    <TO DO: Assign marks to students>
     int []marks1 = new int[10];
     int []marks2 = new int[10];
     for(int i=0;i<10;i++){
         marks1[i] = input.nextInt();
     }
     eeeStudent1.setMarks(marks1);
     
     marks2[]={23,34,12,13,56,89,90,76,30.10};
     eeesStudent2.setMarks(marks2);

    <TO DO: Print the max marks of both students>
     System.out.println("Maximum marks of student 1 and 2 are "+eeeStudent1.max_Marks,eeeStudent2.max_Marks);

    <TO DO: Take input of a subject index from user and print
    which student has more marks in that subject>
    int index = input.nextInt();
    char max = (eeeStudent1.marks[index]>eeeStudent2.marks[index]) ? '1':'2';
    System.out.println("Student"+max+" has secured highest marks in subject "+index);
}

