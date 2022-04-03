import java.util.Scanner;

public class mul_no {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no base:");
        int b=sc.nextInt();
        System.out.println("Enter no1 :");
        int num1=sc.nextInt();
        System.out.println("Enter no2 :");
        int num2=sc.nextInt();
        int result=mul(b, num1, num2);
        System.out.println(result);
    }
    public static int mul(int b,int num1,int num2)
    {
        int sub=0;
        int p=1;
        while(num2>0)
        {
            int temp=num2%10;
            int get=cal(b,num1,temp);
            sub=add(b,sub,get*p);
            p=p*10;
            num2=num2/10;
        }
        return sub;
    }  
    public static int cal(int b,int num,int temp)
    {
        int rv=0;
        int c=0;
        int p=1;
        while(num>0||c>0)
        {
            int d1=num%10;
           
            num=num/10;
           
            int d=d1*temp+c;

            c=d/b;
            d=d%b;
            rv+=d*p;
            p=p*10;
        }
         return rv;
    }  
    public static int add(int b,int num1,int num2)
    {
        int rv=0;
        int c=0;
        int p=1;
        while(num1>0||num2>0||c>0)
        {
            int d1=num1%10;
            int d2=num2%10;
            num1=num1/10;
            num2=num2/10;
            int d=d1+d2+c;

            c=d/b;
            d=d%b;
            rv+=d*p;
            p=p*10;
        }
         return rv;
    } 
}
