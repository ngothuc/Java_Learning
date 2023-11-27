package oop_27_11_23;

public class Vector {

    private double x, y;

    public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector addVector(Vector vector) {

        Vector sumVector = new Vector(0, 0);

        sumVector.setX(this.getX() + vector.getX());
        sumVector.setY(this.getY() + vector.getY());

        return sumVector;
    }

    public Vector multiplyVector(double coeficient) {
        Vector ansVector = new Vector(this.getX(), this.getY());

        ansVector.setX(this.getX() * coeficient);
        ansVector.setY(this.getY() * coeficient);

        return ansVector;
    }

    public double multiplyVector(Vector vector) {
        double ans;

        ans = this.getX() * vector.getX() + this.getY() * vector.getY();

        System.out.println(ans);

        return ans;
    }

    public static void printVector(Vector vector) {       
        System.out.println("(" + vector.getX() + ", " + vector.getY() +")");
    }

    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 1);
        Vector vector2 = new Vector(2, 2);

        Vector sumVector = vector1.addVector(vector2);
        printVector(sumVector);

        printVector(vector1.multiplyVector(5));

        vector1.multiplyVector(vector2);
    }

}
