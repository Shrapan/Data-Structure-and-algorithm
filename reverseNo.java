import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number,count=0;
        while(temp>0)       //n times loop executes
        {
            count++;
            temp=temp/10;
        }
        int p=1,total=0;
        while(count>0)
        {
            int no1=number/(int)Math.pow(10,count-1);
            total=total+no1*(int)Math.pow(10,p-1);
            number=number%(int)Math.pow(10,count-1);
            count--;
            p++;
        }
    System.out.println(total);
   
    }
    
}
