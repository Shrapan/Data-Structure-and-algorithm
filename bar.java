import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class bar {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array");
        for(int i=0;i<size;i++){
            System.out.println("element please : - ");
            arr[i]=sc.nextInt();
        }
        for(int i=7;i>=1;i--)
        {
            for(int j=0;j<size;j++)
            {
                if(arr[j]>=i)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        
    }
    
}
