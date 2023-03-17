package 实验五;

import java.io.IOException;

/*
catch(ArithmeticException e)执行条件：当发生运算错误时进入，如0作为除数
catch(ArrayIndexOutOfBoundsException e)执行条件：当发生数组索引越界时进入，如传入index=1时
finally执行条件:不论是否发生异常都一定会运行

First try block in main() entered
First try block in divide() entered
Code at end of first try block in divide()
finally block in divide()
Executing code after try block in divide()
result=2
First try block in divide() entered
ArithmeticException caught in divide()
finally block in divide()
Executing code after try block in divide()
result=2
First try block in divide() entered
IndexOutOfBoundsException caught in divide()
finally block in divide()
Executing code after try block in divide()
IndexOutOfBoundsException caught in main()
Outside first try block in main()

Press enter to exit

*/

public class MainTest5_3
{
    public static void main(String[] args)
    {
        int[] x={10,5,0};
        try
        {
            System.out.println("First try block in main() entered");
            System.out.println("result="+divide(x,0));
            x[1]=0;
            System.out.println("result="+divide(x,0));
            x[1]=1;
            System.out.println("result="+divide(x,1));
        }
        catch(ArithmeticException e)
        {
            //当发生运算错误时进入，如0作为除数
            System.out.println("ArithmeticException caught in main()");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            //数组索引越界时进入，如接收到array[3]时
            System.out.println("IndexOutOfBoundsException caught in main()");
            System.out.println("Outside first try block in main()");
            System.out.println("\nPress enter to exit");
        }

        /*
        try{}
        catch(IOException e)
        {
            System.out.println("IOException caught in main()");
        }
        finally
        {
            System.out.println("finally block for second try block in main()");
            System.out.println("Executing code after second try block in main()");
        }
         */
    }

    public static int divide(int[] array,int index)
    {
        try
        {
            System.out.println("First try block in divide() entered");
            array[index+2]=array[index]/array[index+1];
            System.out.println("Code at end of first try block in divide()");
            return array[index+2];
        }
        catch(ArithmeticException e)
        {
            //当发生运算错误时进入，如0作为除数
            System.out.println("ArithmeticException caught in divide()");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            //数组索引越界时进入，如传入index=1时
            System.out.println("IndexOutOfBoundsException caught in divide()");
        }
        finally
        {
            //无论如何都会执行的代码块
            System.out.println("finally block in divide()");
            System.out.println("Executing code after try block in divide()");
            return array[index+2];
        }
    }
}


