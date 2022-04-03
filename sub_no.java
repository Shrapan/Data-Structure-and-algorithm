import java.util.Scanner;

public class sub_no {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no base:");
        int b=sc.nextInt();
        System.out.println("Enter no1 :");
        int num1=sc.nextInt();
        System.out.println("Enter no2 :");
        int num2=sc.nextInt();
        int result=getValue(b, num1, num2);
        System.out.println(result);
    }
    public static int getValue(int b,int num1,int num2)
    {
        int rv=0;
        int c=0;
        int p=1;
        while(num1>0 || c>0)
        {
            int d1=num1%10;
            int d2=num2%10;
        num1=num1/10;
        num2=num2/10;
     int temp=d1-d2+c;
        if(temp<0)
        {
            temp=temp+b;
            c=-1;

        }
        else{
            c=0;

        }
        
        
       
            rv+=temp*p;
            p=p*10;
        }
        return rv;
    }
    
}
