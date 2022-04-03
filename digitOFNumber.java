import java.util.Scanner;

public class digitOFNumber
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number,count=0;
        while(temp>0)       //n times loop executes
        {
            count++;
            temp=temp/10;
        }
        // int rem=0;
        while(count>0) //n times loop executes
        {
            int left=number/(int)Math.pow(10,count-1);
            System.out.println(left);
            number=number%(int)Math.pow(10,count-1);
            count--;
            
            
        }
    }
    

}
//total time n+n=2n times loop will executes
