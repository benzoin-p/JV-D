package 实验二;
import java.util.*;

public class Sort
{
    public void setArray(int[] a)
    {
        Random rand = new Random();
        for(int i=0;i<20;i++)
        {
            a[i]= rand.nextInt(100);
            for(int j=0;j<i;)
            {
                if(a[i]==a[j])
                {
                    a[i]=rand.nextInt(100);
                    continue;
                }
                j++;
            }
        }
    }

    public void QSort(int[] a,int p,int q)
    {
        int i=p;
        int j=q;
        int temp=a[i];
        while(i<j&&i<a.length-1)
        {
            while(i<j&&a[j]>=temp)
            {
                j--;
            }
            a[i]=a[j];
            while(i<j&&a[i]<=temp)
            {
                i++;
            }
            a[j]=a[i];
        }
        a[i]=temp;
        if(p<q&&i<a.length-1)
        {
            QSort(a,p,i-1);
            QSort(a,i+1,q);
        }
    }

    public void dispArray(int[] a)
    {
        for(int i=0;i<a.length;i=i+5)
        {
            for(int j=i;j<i+5;j++)
            {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }


}
