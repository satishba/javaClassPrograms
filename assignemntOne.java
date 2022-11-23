import java.util.Scanner;

class Student {

    int usn;
    char sem;
    int marks[] = new int[8];

    //Constructor to initialize sem and usn
    Student(int USN, char SEM) {
        this.usn = USN;
        this.sem = SEM;
    }

    // constructor with no intialization
    Student() {
    }

    public void setUsn() {
        Scanner inobj = new Scanner(System.in);
        int usn = inobj.nextInt();
        this.usn=usn;
    }

    public void setSem() {
        Scanner inobj = new Scanner(System.in);
        char sem = inobj.next().charAt(0);
        this.sem=sem;
    }
    // ADD METHOD TO SET MARKS
    public void setMarks() {
        Scanner inobj = new Scanner(System.in);
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = inobj.nextInt();
        }
    }

    public int getUsn() {
        return usn;
    }

    public char getSem() {
        return sem;
    }

    public int[] getMarks() {
        return marks;
    }
    //to find maximum marks
    public int getMaxMark() {
        int m = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > m) {
                m = marks[i];
            }
        }
        return m;
    }
}
public class todo{
    public static void main(String[] args) {
        Student eeestudent1;
        eeestudent1=new Student();
        System.out.println("assign usn and semester to student 1");
        eeestudent1.setUsn();
        eeestudent1.setSem();
        Student eeestudent2 = new Student(123,'v');
        //Assign marks to students
        System.out.println("assign marks to student 1");
        eeestudent1.setMarks();
        System.out.println("assign marks to student 2");
        eeestudent2.setMarks();
        //Print the max marks of both students
        System.out.println("student 1 maximum marks"+eeestudent1.getMaxMark());
        System.out.println("student 2 maximum marks"+eeestudent2.getMaxMark());
        //Take input of a subject index from user
        Scanner inobj=new Scanner(System.in);
        System.out.println("Input subject index");
        int index = inobj.nextInt();
        //print which student has more marks in that subject
        if(eeestudent1.marks[index]>eeestudent2.marks[index])
        {
            System.out.println("Student 1 scored more ="+eeestudent1.marks[index]);
        } else if (eeestudent1.marks[index]<eeestudent2.marks[index]) {
            System.out.println("Student 2 scored more ="+eeestudent2.marks[index]);

        }
        else
            System.out.println("both scored equal ="+eeestudent1.marks[index]);

    }
}
