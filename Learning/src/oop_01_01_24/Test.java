package oop_01_01_24;

public class Test {
    public static int plus(int... arr) {
        int result = 0;
        for (int i : arr) {
        result += i;
        }
    return result;
    }
    public static void main(String[] args) {
    	StringBuffer buffer = new StringBuffer();
    	buffer.append("This is ") ;
    	buffer.append("String") ;
    	buffer.insert(7," a") ;
    	buffer.append('.');
    	System.out.println(buffer.length()); // 17
    	System.out.println(buffer.capacity()); // 32
    	String output = buffer.toString() ;
    	System.out.println(output); // "This is a String."
    }
}
