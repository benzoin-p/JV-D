package 实验三;

public class Circle extends Point
{
    protected double r;

    Circle()
    {
        super();
        setR(0.0);
    }

    Circle(double x,double y,double r)
    {
        super(x,y);
        setR(r);
    }

    public void setR(double r)
    {
        this.r = r;
    }

    public double getR()
    {
        return r;
    }

    public double getArea()
    {
        return Math.PI*r*r;
    }
}
