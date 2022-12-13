
import java.util.Scanner;

class Student {

    int usn;
    char sem;
    int marks[] = new int[8];

    // <TO DO : Add constructor with no intializations>
    Student() {
        usn = 0;
        sem = '\u0000';
    }

    // <TO DO:Add Constructor to initialize sem and usn>
    Student(int ipusn, char ipsem) {
        usn = ipusn;
        sem = ipsem;
    }

    public void setSem() {
        Scanner sc = new Scanner(System.in);
        this.sem = sc.next().charAt(0);
    }

    public void setUsn(int usn) {
        Scanner sc = new Scanner(System.in);
        this.usn = sc.nextInt();

    }

    // <TO DO : ADD METHOD TO SET MARKS>
    public void setMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = sc.nextInt();
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

    public int getMaxMarks() {
        int mx = 0;
        for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] > mx) {
                mx = this.marks[i];
            }
        }
        return (mx);
    }

}

public class assignemntOne {
    public static void main(String[] args) {
        Student eeeStudent1 = new Student();
        eeeStudent1.setUsn(0);
        eeeStudent1.setSem();

        int usn = 146;
        char sem = '5';
        Student eeeStudent2 = new Student(usn, sem);

        // <TO DO: Assign marks to students>
        eeeStudent1.setMarks();
        eeeStudent2.setMarks();

        // <TO DO: Print the max marks of both students>
        int maxmarksst1 = eeeStudent1.getMaxMarks();
        int maxmarksst2 = eeeStudent2.getMaxMarks();
        System.out.println(maxmarksst1);
        System.out.println(maxmarksst2);

        // <TO DO: Take input of a subject index from user and print
        // which student has more marks in that subject>
        Scanner sc = new Scanner(System.in);
        int subindex = sc.nextInt();
        if (eeeStudent1.marks[subindex] > eeeStudent1.marks[subindex]) {
            System.out.println("Student 1 has more marks ");
        } else if (eeeStudent1.marks[subindex] < eeeStudent1.marks[subindex]) {
            System.out.println("Student 2 has more marks ");
        } else {
            System.out.println("Both has equal marks");
        }

    }
}
