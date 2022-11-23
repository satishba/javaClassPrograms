import java.util.Scanner;

class Student{

    int usn;
    char sem;
    int marks[] = new int[8];

    public Student(int usn, char sem) {
        this.sem=sem;
        this.usn=usn;
    }

    public Student() {

    }



//    <TO DO:Add Constructor to initialize sem and usn>
//    <TO DO : Add constructor with no intializations>
    public void setSem() {
        Scanner sc  = new Scanner(System.in);
        this.sem=sc.next().charAt(0);
    }
    public void setUsn(int usn) {
        Scanner sc  = new Scanner(System.in);
        this.usn=sc.nextInt();

    }

//<TO DO : ADD METHOD TO SET MARKS>
public void setMarks(int []marks){
        this.marks=marks;
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
//    <TO DO: Add a method to find maximum marks>
    public int maxMarks( int []marks){
        int i;


        int max = marks[0];


        for (i = 1; i < marks.length; i++)
            if (marks[i] > max)
                max = marks[i];

        return max;

    }

}


public class assignemntOne {
    public static void main(String[] args) {
        Student eeeStudent1 = new Student();
        int usn = 20;
        char sem='v';
        Student eeeStudent2 = new Student(usn,sem);
//    <TO DO: Assign marks to students>
        Scanner inputobj=new Scanner(System.in);
        for(int i=0;i<8;i++){
            eeeStudent1.marks[i]=inputobj.nextInt();
        }
        System.out.println("for student 2");
        for(int i=0;i<8;i++){
            eeeStudent2.marks[i]=inputobj.nextInt();
        }
eeeStudent1.setMarks(eeeStudent1.marks);
        eeeStudent2.setMarks(eeeStudent2.marks);

int max1= eeeStudent1.maxMarks(eeeStudent1.marks);

        int max2= eeeStudent2.maxMarks(eeeStudent2.marks);
//    <TO DO: Print the max marks of both students>
//
//    <TO DO: Take input of a subject index from user and print
//        which student has more marks in that subject>
        System.out.println("index subject");
        int sub;
    sub= inputobj.nextInt();


       if(eeeStudent1.marks[sub]>eeeStudent2.marks[sub]) {
           System.out.println("student 1 has more marks in that subject");
       }
       else
           System.out.println("student 2 has more marks in that subject");


    }


}
