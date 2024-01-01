package oop_01_01_24;

import javax.swing.JOptionPane;

public class StaticTest {

    public static int iStatic;
    public int iNonStatic;

    public static void main(String[] args) {
        StaticTest obj1 = new StaticTest();

        obj1.iStatic = 10; obj1.iNonStatic = 11;
        System.out.println(obj1.iStatic + ',' + obj1.iNonStatic);

        StaticTest obj2 = new StaticTest();
        System.out.println(obj2.iStatic + ',' + obj2.iNonStatic);

        obj2.iStatic = 12;
        System.out.println(obj1.iStatic + ',' + obj1.iNonStatic);
    }
}
