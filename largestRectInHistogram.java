import java.util.Stack;

public class largestRectInHistogram {
    public static int nextElement(int arr, int i, int j) {

        return 0;
    }

    public static void main(String[] args) {
        // 6 2 5 4 5 1 6
        /*
         * | |
         * | | | |
         * | | | | |
         * | | | | |
         * | | | | | |
         * | | | | | | |
         */

        int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
        Stack<Integer> stc = new Stack<>();

        int[] rb = new int[arr.length];
        int[] lb = new int[arr.length];
        int maxArea = 0;

        // next smaller element in right - 6 2 5 4 5 1 6
        System.out.println(-1);
        stc.push(arr.length - 1);

        for (int i = arr.length; i > 0; i--) {
            while (arr[i] < arr[stc.peek()]) {
                stc.pop();
            }
            if(stc.isEmpty()){
                rb[i]= i;
            }
            rb[i] = stc.peek();
            stc.push(i);
        }
        // next smaller element in left
        for (int j = 0; j < arr.length; j++) {

        }

        for (int i = 0; i < arr.length; i++) {
            int area = (rb[i] - lb[i] - 1) * arr[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }
    }
}
