import java.util.Scanner;

class Prime_Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no please");
        int no=sc.nextInt();
        
        int flag=0;
        for(int i=2;i*i<=no;i++)
        {
            if(no%i==0)
            {
                flag++;
                // System.out.println(flag);
                break;
            }
        }
        System.out.println(flag);
        if(flag==0)
        {
            System.out.println("Prime No");
        }
        else
        {
            System.out.println("Not Prime");
        }

    }
}