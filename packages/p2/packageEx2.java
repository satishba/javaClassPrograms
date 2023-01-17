package packages.p2;

import packages.p1.*;



public class packageEx2 extends packageEx1 {

    packageEx2() {
     //   System.out.println("x1 = " + x1);
       // System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);
    }
}
 class differentPackage {

     differentPackage() {
         packages.p1.packageEx1 p1 = new packages.p1.packageEx1();
      /*  System.out.println("x1 = " + p1.x1);
         System.out.println("x2 = " + p1.x2);
         System.out.println("x3 = " + p1.x3);
         System.out.println("x4 = " + p1.x4);*/
     }


 }

