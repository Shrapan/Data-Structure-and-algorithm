import java.util.*;
class maxBorder {
    public static void main(String args[] ) throws Exception {
       
       
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){

            int row=Integer.parseInt(sc.nextLine());
            int col=Integer.parseInt(sc.nextLine());
            
            
            int a=0;
            for(int j=0;j<row;j++)
            {
                
            
               a= maxMum(a,callMax(col));
                

                
            }
            System.out.println(a);
        }
        
    }
 public static int maxMum(int a,int b)
 {
     if(a>b)
     {
         return a;
     }
     return b;
 }
    public static int callMax(int col)
    {
        Scanner sc=new Scanner(System.in);
        int max=0;
        char ch[]=new char[col];
        for(int i=0;i<ch.length;i++)
        {
            ch[i]= sc.next().charAt(i);
        }

        for(int k=0;k<ch.length;k++)
                {
                    char c=ch[k];
                    if(c=='#')
                    {
                        max++;
                    }
                }
                return max;
    }
}
