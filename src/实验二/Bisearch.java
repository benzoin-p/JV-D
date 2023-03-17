package 实验二;

public class Bisearch
{
    public int search(int[] a,int p,int q,int k)
    {
        if(a==null||q<p)
        {
            return -1;
        }
        int mid=(p+q)/2;

        if(q-p==1||q==p)
        {
            if(k==a[q])
            {
                return q;
            }
            else if(k==a[p])
            {
                return p;
            }
            else
            {
                return -1;
            }
        }

        if(k<a[mid])
        {
            return search(a,p,mid,k);
        }
        else if(k>a[mid])
        {
            return search(a,mid,q,k);
        }
        else if(k==a[mid])
        {
            return mid;
        }
        else
        {
            return -1;
        }
    }
}
