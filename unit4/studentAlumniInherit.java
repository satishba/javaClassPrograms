package unit4;
class Student {
    String name;
    private String usn;

    Student(String name,String usn){
        this.name = name;
        this.usn = usn;

    }
    Student (){

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public String getUsn() {
        return usn;
    }
}

class Alumni extends Student {
    String yop;
    String name;
    Alumni(String name,String usn,String yop,String workingOrganization) {
        super(name,usn);
        this.yop = yop;
        name=workingOrganization;
        super.name = name;
    }
    void displayInfo(){
        System.out.println("The details are ");
        System.out.println("USN : " + getUsn());
        System.out.println("Name : " + getName());
        System.out.println("yop :" + yop);
        System.out.println("orga : ");
    }
}

public class studentAlumniInherit {
    public static void main(String[] args) {
        Alumni a1 = new Alumni("xyz","1234","2023","TI");

        a1.yop="2023";
        a1.name="Texas Instruments";

        a1.setName("abx");
        a1.setUsn("1ds19ee");
        a1.displayInfo();

        Student s1 = new Student();






    }
}






