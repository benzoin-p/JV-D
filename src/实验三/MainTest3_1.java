package 实验三;

public class MainTest3_1
{
    public static void main(String[] args)
    {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(1,1,1,1);
        Cylinder c3 = new Cylinder(Math.E,Math.E,1/Math.sqrt(Math.PI),Math.PI);
        Cylinder[] c={c1,c2,c3};

        String str1;
        String str2;
        for(int i=0;i<c.length;i++)
        {
            str1 = String.format("c%d轴心位置的坐标为(%.2f,%.2f)",i,c[i].getX(),c[i].getY());
            str2 = String.format("c%d的底面半径、高、体积分别为：%.2f %.2f %.2f \n",i,c[i].getR(),c[i].getH(),c[i].getVolume());
            System.out.println(str1);
            System.out.println(str2);
        }
    }
}
