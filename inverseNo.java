import java.util.Scanner;

//Inverse of Number
public class inverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0,temp=number;
        while(temp>0)
        {
            count++;
            temp=temp/10;

        }
       int inverse=0,pos=1;
        while(count>0)
        {
            int rem=number%(int)Math.pow(10,1);

            inverse=inverse+(int)Math.pow(10,rem-1)*pos;
            number=number/(int)Math.pow(10,1);
            count--;
            pos++;
           
         
        }
        System.out.println(inverse);
    }
    
}
