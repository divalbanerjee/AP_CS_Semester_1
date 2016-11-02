package Graphing;

/**
 * Created by div on 11/2/2016.
 */
public class Point {
    private double myX;
    private double myY;

    public Point(double myY, double myX) {
        this.myY = myY;
        this.myX = myX;
    }

    public double getMyX() {
        return myX;
    }

    public void setMyX(double myX) {
        this.myX = myX;
    }

    public double getMyY() {
        return myY;
    }

    public void setMyY(double myY) {
        this.myY = myY;
    }

    public String toString() {
        return "Point{" +
                "myX=" + myX +
                ", myY=" + myY +
                '}';
    }
}
