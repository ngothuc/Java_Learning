package oop_01_01_24;

public class StringVsStringBuffer {

    public static double addString() {
        double startTime = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i < 100000; i++) {
            str += String.valueOf(i);
        }
        double endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static double addStringBuffer() {
        double startTime = System.currentTimeMillis();
        StringBuffer str = new StringBuffer();

        for(int i = 0; i < 100000; i++) {
            str.append(String.valueOf(i));
        }

        double endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        System.out.println(addString());
        System.out.println(addStringBuffer());
    }

}
