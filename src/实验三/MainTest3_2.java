package 实验三;

public class MainTest3_2
{
    public static void main(String[] args)
    {
        Graduate graduate= new Graduate("zhangsan","male",24);
        graduate.setFee(12000);
        graduate.setPay(2100);
        int FeeAYear=graduate.getFee()*2;
        int PayAYear=graduate.getPay()*12;
        if(PayAYear - FeeAYear < 2000)
        {
            System.out.println("provideALoan");
        }
    }
}
