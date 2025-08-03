package recursion_problems;

import java.util.Stack;

public class Sorting_a_Stack_usingRecursion {
    public static  void  sorting(Stack<Integer> st){
        if(!st.isEmpty()){
            int top=st.peek();
            st.pop();
            sorting(st);
            insert_into_sorted_stack(st,top);
        }
    }
    public static void insert_into_sorted_stack(Stack<Integer>st,int element){
        if(st.isEmpty() || st.peek()<=element){
            st.push(element);
            return;
        }
        int top=st.pop();
        insert_into_sorted_stack(st,element);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        System.out.println("Original Stack : "+st);
        sorting(st);
        System.out.println("Sorted Stack : "+st);

    }
}
