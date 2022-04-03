import java.util.Stack;

public class histogram {
    public static void main(String[] args) {
        int arr[]={6,2,5,4,5,1,6};
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int rm[]=new int[arr.length];
        rm[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--)
        {
            while(st1.size()>0 && arr[i]>=arr[st1.peek()])
            {
                int pos=st1.peek();
                rm[]
                st1.pop();
            }
        }
        int ls[]=new int[arr.length];
        ls[0]=-1;
    
        int maxArea=0;
        for(int i=0;i<arr.length;i++)
        {
            int getValue=rm[i]-ls[i]-1;
            int max=getValue*arr[i];
            if(max>maxArea)
            {
                maxArea=max;
            }
        }
       System.out.println("Histogram "+maxArea);
    }
    
}
