package oop_03_01_24;

import java.awt.*;

import static java.lang.Math.PI;

public class Circle extends Shape implements Actable{

    private int radius;

    Circle(String name, int rad) {
        super(name);
        this.radius = rad;
    }

    Circle(String name, int x, int y, int rad) {
        this(name, rad);
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        System.out.println("Draw circle at (" + x + ", " + y + ")");
        g.drawOval(x-radius, y-radius, 2*radius, 2*radius);
    }

    @Override
    public double calculateArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public void moveTo(Graphics g, int x, int y) {
        x = x; y = y; draw(g);
    }

    @Override
    public void fill(Graphics g) {
        System.out.println("Fill circle at (" + x + ", " + y + ")");
        //To do sth
    }

}
