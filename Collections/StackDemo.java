import java.util.Stack;

/**
 * StackDemo
 */
public class StackDemo {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("lion");
        st.push("cat");
        st.push("leopard");
        System.out.println(st.peek());
        st.pop();
        
        System.out.println(st);
    }
}