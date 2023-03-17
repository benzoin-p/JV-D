package 测试;

public enum SeasonEnum
{
    SPRING(1),SUMMER(3),AUTUMN(5),WINTTER(7);
    public int index;
    private SeasonEnum(int index)
    {
        this.index=index;
    }
}
