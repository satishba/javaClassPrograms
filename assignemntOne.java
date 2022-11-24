
import java.util.Arrays;
import java.util.Scanner;

class Student{

    int usn;
    char sem;
    int marks[] = new int[8];
    // <TO DO:Add Constructor to initialize sem and usn>
    Student(int usn,char sem){
        this.usn=usn;
        this.sem=sem;
 }
    // <TO DO : Add constructor with no intializations>
    Student(){

    }
    public void setSem() {
        Scanner sc  = new Scanner(System.in);
        this.sem=sc.next().charAt(0);
    }
    public void setUsn() {
        Scanner sc  = new Scanner(System.in);
        this.usn=sc.nextInt();

    }

// <TO DO : ADD METHOD TO SET MARKS>
public void setMarks(){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<8;i++){
        this.marks[i]=sc.nextInt()
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
    // <TO DO: Add a method to find maximum marks>
    public int getMaxMarks(){
        Arrays.sort(marks);
        return marks[7];
        
    }
    public int getIndexMarks(){
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        return marks[index];
    }
    

}


public class assignemntOne {
    public static void main(String[] args) {
    Student eeeStudent1 = new Student();
   
    eeeStudent1.setUsn();
    eeeStudent1.setSem();
int usn;
char sem;

    Student eeeStudent2 = new Student(usn,sem);
    // <TO DO: Assign marks to students>
    eeeStudent1.setMarks();
    eeeStudent2.setMarks();

    // <TO DO: Print the max marks of both students>
    eeeStudent1.getMaxMarks();
    eeeStudent2.getMaxMarks();

    // <TO DO: Take input of a subject index from user and print
    // which student has more marks in that subject>
    int a= eeeStudent1.getIndexMarks();
    int b= eeeStudent2.getIndexMarks();
    if(a>b){
        System.out.println("eeeStudent1");
    }
    else{
        System.out.println("eeeStudent2");
    
    }



    }
}

