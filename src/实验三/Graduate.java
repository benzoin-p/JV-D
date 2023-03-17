package 实验三;

public class Graduate implements StudentManageInterface,TeacherManageInterface
{
    private String name;
    private String sex;
    private int age;
    private int fee;
    private int pay;

    Graduate()
    {
        name="null";
        sex="null";
        age=0;
    }

    Graduate(String name,String sex,int age)
    {
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    @Override
    public void setFee(int fee)
    {
        this.fee = fee;
    }

    @Override
    public void setPay(int pay)
    {
        this.pay = pay;
    }

    @Override
    public int getFee()
    {
        return fee;
    }

    @Override
    public int getPay()
    {
        return pay;
    }

}
