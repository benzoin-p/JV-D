package 测试;
import java.util.*;
import java.io.*;

public class Main extends Parents
{
    @Override
    public void dissp() {
        System.out.println("收到收到");
    }


    public static void main(String[] args)
    {
        String a="A"+"B"+"C";
        String b="ABC";
        String c="A";
        String d=c+"BC";
        System.out.println(a==b);
        System.out.println(c==d);

        Set<String> hashset=new HashSet<String>();
        hashset.add("AAA");
        hashset.add("BBB");
        //hashset.add(6666696);
        Iterator iterator = hashset.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
