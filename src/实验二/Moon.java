package 实验二;
import java.util.*;

public class Moon
{
    private final String[] moon={"January","February","March","April","May","June","July","August","September","October","November","December"};

    public String getMoon(int i)
    {
        return moon[i-1];
    }

    public int getRand()
    {
        Random rand = new Random();
        return rand.nextInt(12)+1;
    }
}
