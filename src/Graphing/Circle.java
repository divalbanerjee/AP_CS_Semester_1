package Graphing;



/**
 * Created by div on 11/2/2016.
 */
public class Circle {
    private LineSegment myRadiusLine;

    public Circle(LineSegment myRadiusLine) {
        this.myRadiusLine = myRadiusLine;
    }

    public LineSegment getMyRadiusLine() {
        return myRadiusLine;
    }

    public void setMyRadiusLine(LineSegment myRadiusLine) {
        this.myRadiusLine = myRadiusLine;
    }



    public String toString() {
        return "Circle{" +
                "myRadiusLine=" + myRadiusLine +
                '}';
    }
}
