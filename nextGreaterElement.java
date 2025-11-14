import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3,7,9,0,8};
        //{6,4,7,3,0,9,4,1}
        Stack<Integer> stc = new Stack<>();

        System.out.println(-1);
        stc.push(arr[arr.length-1]);

        for (int i = arr.length-2; i>=0; i--) {
            while (!stc.isEmpty() && arr[i]>=stc.peek()  ) {
                stc.pop();
            }
            
            if (stc.isEmpty()) {
                System.out.println(-1);
            }else{
            System.out.println(stc.peek());
            }
            stc.push(arr[i]);
        }
    }
}
