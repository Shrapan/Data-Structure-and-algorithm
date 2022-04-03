import java.util.Scanner;

public class sumOfArray
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base to convert");
        int b=sc.nextInt();
        System.out.println("Enter 1 Array Size");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        for(int i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter 1 Array Size");
        int size2=sc.nextInt();
        int arr2[]=new int[size1];
        for(int i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int sum[]=new int[size1>size2?size1:size2];
        int i=size1-1;
        int j=size2-1;
        int k=sum.length-1;
        int c=0;
        while(k>=0)
        {
            int d=c;
            if(i>=0){
                d+=arr1[i];
            }
            
            if(j>=0){
                d+=arr1[j];
            }
            c=d/b;
            d=d%b;

            sum[k]=d;
            
            i--;
            j--;
            k--;
        }
        if(c>0)
            {
                System.out.print(c);
            }
            for(int a:sum)
            {
                System.out.print(a);
            }
 
     
}
}