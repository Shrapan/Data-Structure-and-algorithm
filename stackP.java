import java.util.Stack;

public class stackP {
    public static void main(String arg[])
    {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        System.out.println(st);
        st.pop();
        System.out.println( st.size());
        st.peek();
        st.pop();
        st.pop();
        st.pop();
       
        System.out.println( st.size());
        System.out.println(st);
    }    
}
