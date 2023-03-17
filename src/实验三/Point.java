package 实验三;

public class Point
{
    protected double x,y;

    Point()
    {
        setX(0.0);
        setY(0.0);
    }

    Point(double x,double y)
    {
        setX(x);
        setY(y);
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

}
