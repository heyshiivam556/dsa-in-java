import java.util.Stack;

public class largestRectInHistogram {
    public static int nextElement(int arr, int i, int j) {

        return 0;
    }

    public static void main(String[] args) {
        // 6 2 5 4 5 1 6
        /*
         * |           |
         * |   |   |   |
         * |   | | |   |
         * |   | | |   |
         * | | | | |   |
         * | | | | | | |
         */

        int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
        Stack<Integer> stc = new Stack<>();

        int[] rb = new int[arr.length];
        int[] lb = new int[arr.length];
        int maxArea = 0;


        // next smaller element in right - 6 2 5 4 5 1 6

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stc.isEmpty() && arr[i] <= arr[stc.peek()]) {
                stc.pop();
            }
            if(stc.isEmpty()){          
                rb[i]= arr.length;               //if there isn't any bigger no. then store itself
           //System.out.println(i);
            }else{
            rb[i] = stc.peek();
           //System.out.println(stc.peek());
            }
            stc.push(i);
        }
        stc.clear();
        // next smaller element in left - 6 2 5 4 5 1 6

        for (int j = 0; j < arr.length; j++) {
            while (!stc.isEmpty() && arr[j]<arr[stc.peek()]) {
                stc.pop();
            }
            if (stc.isEmpty()) {
                lb[j] = -1;
               //System.out.println(arr[j]);

            }else{
                lb[j] = stc.peek();
                //System.out.println(arr[stc.peek()]);
            }
            stc.push(j);            
        }

        for (int i = 0; i < arr.length; i++) {
            int area = (rb[i] - lb[i] - 1) * arr[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}

/*mistakes
if (stc.isEmpty()) rb[i] = i;
if (stc.isEmpty()) lb[i] = i;

This means you're telling your code:

“If no smaller element on the right, the bar ends at itself”

“If no smaller element on the left, the bar starts at itself”

This translates to:

👉 The bar cannot extend at all, even if it actually can.
👉 So the width becomes zero, which destroys the area calculation.


*/ 
