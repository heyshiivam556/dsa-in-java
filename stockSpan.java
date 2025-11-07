import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int[] arr = {1,2,3,14,5,8,6,9,7,8};
        int[] ans = new int[arr.length];
        Stack<Integer> stc = new Stack<>();
        
        // stc.push(1);
        // System.out.println(stc.peek());

        for (int i = 0; i < arr.length; i++) {
         while (!stc.isEmpty() && arr[stc.peek()]<=arr[i]) {
            stc.pop();
         } 
         if (stc.isEmpty()) {
            ans[i] = i+1;
         }
         else{
            ans[i] = i - stc.peek();
         }
            stc.push(i);
        }
        for (int i : ans) {
            System.out.print(i+" ");            
        }
    }
}
