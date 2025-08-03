package recursion_problems;

import java.util.Stack;

public class reverse_aStack_usingRecursion {
    public static void reverse(Stack<Integer>st){
        if(!st.isEmpty()){
            int top=st.peek();
            st.pop();
            reverse(st);
            insertAtBottom(st,top);

        }
    }
    public static void insertAtBottom(Stack<Integer>st,int value){
        if(st.isEmpty()){
            st.push(value);
            return;
        }
        int top=st.pop();
        insertAtBottom(st,value);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        System.out.println("Original Stack : "+st);
        reverse(st);
        System.out.println("Sorted Stack : "+st);
    }
}
