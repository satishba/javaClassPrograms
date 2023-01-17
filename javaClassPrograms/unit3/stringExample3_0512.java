package javaClassPrograms.unit3;

public class stringExample3_0512 {
    public static void main(String[] args) {
        String name="Hello Java";
        int spaceAt = name.indexOf(" ");
        String firstName=name.substring(0,spaceAt);
        String lastname = name.substring(spaceAt+1);
        System.out.println(firstName);
        System.out.println(lastname);
        String s[] = name.split(" ");
        System.out.println(s[0]);  
        System.out.println(s[1]);
            System.out.println(name.indexOf('a',8));
    }
}
