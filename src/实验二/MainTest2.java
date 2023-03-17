package 实验二;
import java.util.*;

public class MainTest2
{

    public static void main(String[] args)
    {
        //排序
        int[] a= new int[20];
        Sort sort =new Sort();
        sort.setArray(a);
        sort.QSort(a,0,a.length-1);
        System.out.println("排序后的数据为：");
        sort.dispArray(a);
        System.out.println();

        //查找
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入要查找的数据k：");
        int k=scan.nextInt();
        Bisearch bisearch = new Bisearch();
        int i=bisearch.search(a,0,a.length-1,k);
        if(i!=-1)
        {
            System.out.println(k+":"+i+'\n');
        }
        else
        {
            System.out.println("未找到"+k+'\n');
        }

        //输出月份
        Moon moon = new Moon();
        int t= moon.getRand();
        System.out.println("产生的随机整数值为："+t);
        System.out.println(moon.getMoon(t)+'\n');

        //格式化输出日期
        DateTrans dateTrans = new DateTrans();
        dateTrans.dispDate();

    }
}
