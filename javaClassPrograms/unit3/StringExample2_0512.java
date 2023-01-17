/*WAP to print the characthers of a
 string one charachter at a time.
 */
package javaClassPrograms.unit3;


public class StringExample2_0512 {
    public static void main(String[] args) {
        String s1="Hello";
        char ch[] = new char[s1.length()];
        ch = s1.toCharArray();
        for(char x:s1.toCharArray()){
            System.out.println(x);
        }
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }


    }
}

