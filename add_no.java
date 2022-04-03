import java.util.*;
class add_no {
        public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter base");
            int b=sc.nextInt();
            System.out.println("Enter number 1");
            int num1=sc.nextInt();
            System.out.println("Enter number 2");
            int num2=sc.nextInt();
            
            int result=getValue(b, num1, num2);
            System.out.println(result);
        }
        public static int getValue(int b,int num1,int num2)
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
