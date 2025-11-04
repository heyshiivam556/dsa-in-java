import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> stacky = new Stack<>();
        stacky.push(9);
        stacky.push(89);
        stacky.push(167);
        stacky.push(34);
        stacky.push(45);

        
        System.out.println(stacky);
        System.out.println(stacky.peek());
        System.out.println("Empty status : "+stacky.isEmpty());
        stacky.pop();
        System.out.println(stacky.peek());
    System.out.println("-----------------------------------------");

    // Using String with Stack
     Stack<String> strstacky = new Stack<>();

     strstacky.push("hello i am shivam");
     System.out.println(strstacky.peek());
     strstacky.pop(); // will remove the whole string
     System.out.println(strstacky.isEmpty()); //to check ist empty or not


    } 
}
