package javaClassPrograms.unit2;

class Student{
    int usn;
    char sem;
    void welcome(){
        System.out.println("Welcome to EEE Dept");
    }


}


public class basicEEEDept {
    public static void main(String[] args) {
        Student eeeStudent1,eeeStudent2,eeeStudent3;
        eeeStudent1 = new Student();
        eeeStudent1.sem='V';
        eeeStudent1.usn=1;

        eeeStudent2 = new Student();
        eeeStudent2.sem='V';
        eeeStudent2.usn=2;

        eeeStudent3 = new Student();
        eeeStudent3.sem='V';
        eeeStudent3.usn=3;

    }
}
