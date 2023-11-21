package oop_21_11_23;

public class Matrix {

    int [][] elements;

    public Matrix(int n) {
        this.elements = new int[n][n];
    }

    public boolean checkMatrix(int nextRow, int nextCol, int n) {
        if(nextCol < 0 || nextRow >= n) return false;
        if(nextCol < 0 || nextCol >= n) return false;
        if(this.elements[nextRow][nextCol] != 0) return false;
        return true;
    }

}
