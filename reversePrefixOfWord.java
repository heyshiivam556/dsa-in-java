import java.util.Stack;

public class reversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        Stack<Character> stc = new Stack<>();
        
    
        while(word.charAt(0) != ch){
            stc.push(word.charAt(0));
            word = word.substring(1);
        }
        stc.push(word.charAt(0));
            word = word.substring(1);
             
        
        String result = "";
        while(!stc.isEmpty()){
        result = result + stc.pop();
        }
        result = result+word;
        return result;
    }
    
    public static void main(String args[]){
        String word = "abcdefd";
        char ch = 'd';

        String abc = reversePrefix(word,ch);
        System.out.println(abc);
    }
}
