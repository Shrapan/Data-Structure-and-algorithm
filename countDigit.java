import java.util.Scanner;

//counting digit of no
public class countDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int count=0;
        while(digit>0)
        {
            count++;
            digit=digit/10;
        }
        System.out.println(count);

    }
    
}
