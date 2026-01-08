import java.util.Stack;

public class balancedBrackets {

    public static void main(String[] args) {
        // String exp1 = "()[]{[]}";
        String exp1 = "((";
        Stack<Character> stk = new Stack<>();
        
        for (int i = 0; i < exp1.length(); i++) {
            char ch = exp1.charAt(i);
            if (ch=='(' ||ch=='{' || ch=='[') {
            stk.push(ch);
           // System.out.println(stk.peek());
            }else{
                if (ch==')') {
                    if (stk.peek()=='(') {
                        stk.pop();
                    }else{
                        System.out.println(false);
                        return;
                    }
                }else if (ch=='}') {
                    if (stk.peek()=='{') {
                        stk.pop();
                    }else{
                        System.out.println(false);
                        return;
                    }
                }else if (ch==']') {
                    if (stk.peek()=='[') {
                        stk.pop();
                    }else{
                        System.out.println(false);
                        return;
                    }
                }
            }
        }
        if (stk.isEmpty()) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
            
    }
}