package 实验三;

public class Cylinder extends Circle
{
    protected double h;

    Cylinder()
    {
        super();
        setH(0.0);
    }

    Cylinder(double x, double y, double r,double h)
    {
        super(x,y,r);
        setH(h);
    }

    public void setH(double h)
    {
        this.h = h;
    }

    public double getH()
    {
        return h;
    }

    public double getVolume()
    {
        return h*getArea();
    }
}
