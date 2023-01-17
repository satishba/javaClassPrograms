package interfaces;

class useInterface implements sample,sample2{
      public void print() {
        System.out.println("Hello from sample");
    }
    public void anotherPrint(){
        System.out.println("This is another print");
    }
    public void hello(){
          System.out.println("Hello");
    }
}


class interfaceExample{
    public static void main(String[] args) {
    useInterface u1 = new useInterface();
    u1.print();
    u1.anotherPrint();
    sample u2 = new useInterface();
    u2.print();
    //u2.anotherPrint();
    }
}