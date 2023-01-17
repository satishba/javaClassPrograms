package javaClassPrograms.unit3;

/* Reference sheet for CIE2 .
Assumptions
 sout : System.out.println();
scanner class is imported and object "sc" pointes to system.in
Assume USN=1DS20EExxx
		*/
import  java.util.Scanner;
class Student{
    String name; String usn;Marks semMarks[] = new Marks[8];
    Student(){name="";usn="0";}
    void setName(String str){name=name.length()>10?name:"invalid";}
    void setUsn(String usn){usn=usn;}
    void setUsn(){    Scanner sc = new Scanner(System.in);this.usn=sc.next();}
    void setMarks(Marks mark[]){semMarks=mark;}
    String getUsn(){return usn;}
    String getName(){return name;}
    Marks[] getMarks(){return semMarks;}
}
class Classroom{
    char sem;
    Student[] students = new Student[100];
    void  setSem(char sem){this.sem=sem;}
    void setStudents(Student[] students){this.students=students;}
    char getSem(){return sem;}
    Student[] getStudents()	{return students;}
}
class Marks{
    char sem;
    int mark[] = new int[8];
    void setSem(char sem){this.sem=sem;}
    void setMarks(int[] marks){this.mark =mark;}
    char getSem(){return sem;}
    int[] getMarks(){return mark;}
}
class Eeedept {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.usn);     }   }