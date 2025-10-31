import java.util.Stack;

public class douleParenthesis {
    public static void main(String[] args) {
        Stack<Character> strStack = new Stack<>();

       // String exp1 = "((a+b)+(c+d))";
         String exp1 = "((a+b)+((c+d)))";

        for (int i = 0; i < exp1.length(); i++) {
            char ch = exp1.charAt(i);
            //popping upto open bracket
            if (ch == ')') {
                if (strStack.peek() == '(') {
                    System.out.println(true);
                    return;
                }
                while (strStack.peek() != '(') {
                    strStack.pop();
                }
                strStack.pop();
            } //stacking upto closed bracket
            else{
                strStack.push(ch);

            }

        }
        System.out.println(false);
    }
}
