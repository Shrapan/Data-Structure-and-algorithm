//program for fibonaci
public class fibonaci {
    public static void main(String[] arg){
        int a=0;
        int b=1;
        for(int i=1;i<=10;i++)
        {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }

    }
}
