package bai4;

public class MyPoint {
    double x;
    double y;

    public MyPoint() {
        x = 1;
        y = 1;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public MyPoint(MyPoint p) {
        this.x = p.x;
        this.y = p.y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint p1) {
        return (Math.sqrt((p1.x - this.x) * (p1.x - this.x) + (p1.y - this.y) * (p1.y - this.y)));
    }

    public double distance(MyPoint p1, MyPoint p2) {
        return (Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)));
    }
}
