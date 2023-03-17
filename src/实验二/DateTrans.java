package 实验二;

public class DateTrans
{
    private final String[] date={"06/25/04","11/03/05","12/14/21","04/01/02","07/24/02","03/17/10","08/08/08","08/31/17","07/01/21","10/01/19"};

    public void dispDate()
    {
        Moon moon = new Moon();
        for(int i=0;i<9;i++)
        {
            String str = date[i];
            int moonNum = Integer.parseInt(str.substring(0,2));
            int dayNum = Integer.parseInt(str.substring(3,5));
            String yearNum = str.substring(6);
            String dateMoon = moon.getMoon(moonNum);
            String str1;
            String[] th={"st","nd","rd","th"};
            if(dayNum<4)
            {
                str1 = String.format("%d%s%s20%s",dayNum,th[dayNum-1],dateMoon,yearNum);
            }
            else
            {
                str1 = String.format("%d%s%s20%s",dayNum,th[3],dateMoon,yearNum);
            }

            System.out.println(str1);
        }
    }

}
