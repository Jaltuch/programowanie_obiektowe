public class Segment {
    private Point p1,p2;
    private Point points[];

    public Segment(Point x,Point y)
    {
        p1=x;
        p2=y;
        points=new Point[2];

        points[0]=x;
    }
    public void setP1(Point x)
    {
        this.p1=x;
    }
    public Point getP1()
    {
        return p1;
    }
    public void setP2(Point x)
    {
        this.p2=x;
    }
    public Point getP2()
    {
        return p2;
    }
    public double getDistance()
    {
        return Math.hypot(p1.x-p2.x,p1.y-p2.y);
    }

}
