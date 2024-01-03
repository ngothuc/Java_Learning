package oop_03_01_24;

public abstract class Shape {
    protected String name;
    protected int x, y;
    Shape(String name) {
        this.name = name;
    }

    Shape(String name, int x, int y) {
        this(name);
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return this.name;
    }

    public abstract double calculateArea();

}
