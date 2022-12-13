import java.util.Scanner;

    class Student{

        int usn;
        char sem;
        int marks[] = new int[8];
    //<TO DO:Add Constructor to initialize sem and usn>
        Student(int usn1,char sem1) {
            int usn = usn1;
            char sem = sem1;
        }
    //<TO DO : Add constructor with no intializations>
        Student()
        {}
        public void setSem() {
            Scanner sc  = new Scanner(System.in);
            this.sem=sc.next().charAt(0);
        }
        public void setUsn() {
            Scanner sc  = new Scanner(System.in);
            this.usn=sc.nextInt();

        }

//<TO DO : ADD METHOD TO SET MARKS>
        public void setMarks(int marks[]) {Scanner sc=new Scanner(System.in);
            for(int i=0;i<marks.length-1;i++)
            {this.marks[i]=sc.nextInt();

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
        public int getMaximumMarks(int marks[]) {
            int i, max = marks[0];
            for (i = 0; i < marks.length - 1; i++) {
                if (marks[i] > max)
                    max = marks[i];
            }
            return max;
        }




    public class assignmentOne {
        public static void main(String[] args) {
            Student eeeStudent1 = new Student();
            int usn;
            int sem;
            Student eeeStudent2 = new Student(61, '5');
            //<TO DO: Assign marks to students>
            eeeStudent1.setUsn();
            eeeStudent1.setMarks();
            eeeStudent2.setMarks();

            //<TO DO: Print the max marks of both students>
            System.out.println(eeeStudent1.getMaximumMarks());
            System.out.println(eeeStudent2.getMaximumMarks());

            /*<TO DO: Take input of a subject index from user and print
            which student has more marks in that subject>*/
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the index of the subject");
            int index = sc.nextInt();
            if (eeeStudent1.marks[index] > eeeStudent2.marks[index])
                System.out.println("Student 1 has more marks");
            else System.out.println("Student 2 has more marks");
        }
    }`
