import java.util.Stack; 
public class nxtGrtrElmnt {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,6,12,8,11,3,1,7};
        int last=arr.length;
        Stack<Integer> stc = new Stack<>();
        
        stc.push(arr[last-1]);
        System.out.println(arr[last-1]+" grtr than "+"-1");
        for (int i = last-2; i >= 0; i--) {
           while (!stc.isEmpty() && stc.peek()<arr[i]) {
            if (stc.peek()<arr[i]) {
                stc.pop();
            }
           }
            if (stc.size() == 0) {
                System.out.println(arr[i]+" grtr than "+"-1");
            }else{
                System.out.println(arr[i]+" grtr than "+stc.peek());
            }
            stc.push(arr[i]);
        }
    }
}
  