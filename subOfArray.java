import java.util.Scanner;
public class subOfArray {
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
            int temp=0;
            while(k>=0)
            {
            //     int d=c;
            //     if(i>=0){
            //         d+=arr1[i];
            //     }
                
            //     if(j>=0){
            //         d+=arr1[j];
            //     }
            if(j>=0)
            {
               temp=arr1[i]+c-arr2[j];
            }
            else{
                temp=arr1[i]+c;
            }
            
             if(temp<0)
             {
                 temp+=b;
                 c=-1;
             }
             else
             {
                 c=0;
             }
                
                temp=temp%b;
    
                sum[k]=temp;
                
                i--;
                j--;
                k--;
            }
            // if(c>0)
            //     {
            //         System.out.print(c);
            //     }
            int m=0;
            while(m<sum.length)
            {
                if(sum[m]==0)
                {
                    m++;
                }
                else{
                    break;
                }
            }

            while(m<sum.length)
            {
                System.out.print(sum[m]);
                m++;
            }
               
     
         
    }
    
}
