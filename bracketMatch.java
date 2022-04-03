// import java.util.Scanner;
import java.util.Stack;

public class bracketMatch {
    public static void main(String arg[])
    {
        Stack<Character>sk=new Stack<>();
        // System.out.println(sk.size());

        String st="{[{(1+2)]}";
        // char ch[]=st.toCharArray();
        // int len=ch.length;
        int size=0;
        while(size<st.length())
        {
            if(st.charAt(size)=='{' || st.charAt(size)=='[' || st.charAt(size)=='(')
            {
                sk.push(st.charAt(size));
            }
            else{
                if(st.charAt(size)=='}' && sk.peek()=='{')
                {
                    sk.pop();
                }
                else if(st.charAt(size)==')' && sk.peek()=='(')
                {
                    sk.pop();
                }
                else if(st.charAt(size)==']' && sk.peek()=='[')
                {
                    sk.pop();
                }
               
            }
            size++;
        }
       
        if(sk.size()>0)
        {
            System.out.println("no proper matching");
        }
        else{
            System.out.println("matching");
        }
    }    
}

