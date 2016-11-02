package Graphing;

/**
 * Created by div on 11/2/2016.
 */
public class LineSegment {
    private Point myStartPoint;
    private Point myEndPoint;

    public LineSegment(Point startPoint, Point endPoint) {
        this.myStartPoint = startPoint;
        this.myEndPoint = endPoint;
    }

    public Point getStartPoint(){ return this.myStartPoint; }

    public void setStartPoint(Point myStartPoint) {
        this.myStartPoint = myStartPoint;
    }

    public Point getEndPoint() {
        return this.myEndPoint;
    }

    public void setEndPoint(Point myEndPoint) {
        this.myEndPoint = myEndPoint;
    }

    public double findLength(){
        double Length = 0;
        Length = Math.sqrt(((myEndPoint.getMyX() - myStartPoint.getMyX())*(myEndPoint.getMyX() - myStartPoint.getMyX())) + ((myEndPoint.getMyY() - myStartPoint.getMyY())*(myEndPoint.getMyY() - myStartPoint.getMyY())));
        return Length;
    }

}
