import java.util.Stack;

public class nge {
    public static void main(String[] args) {
        int arr[]={2,5,9,3,1,12,6,8,7};
        int nge[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        // int temp=arr.length-1;
        // st.push(-1);
        // nge[temp]=-1;
        // for(int i=temp-1;i>=0;i--){
        //     while(st.size()>0 && arr[i]>=st.peek())
        //     {
        //         st.pop();
        //     }
        //     if(st.size()==0)
        //     {
        //         nge[i]=-1;
        //     }
        //     else{
        //         nge[i]=st.peek();
        //     }
        //     st.push(arr[i]);
        // }
        // for(int i:nge){
        //     System.out.print(i+" ");
        // }
        
            st.push(0);
        for(int i=1;i<arr.length;i++)
        {
            while(st.size()>0 && arr[i]>arr[st.peek()])
            {
                int pos=st.peek();
                nge[pos]=arr[i];
                st.pop();
            } 
            st.push(i);

        }
        while(st.size()>0)
        {
            int pos=st.peek();
            nge[pos]=-1;
            st.pop();
        }
        for(int i:nge)
        {
            System.out.print(i+" ");
        }
    }
    
}

