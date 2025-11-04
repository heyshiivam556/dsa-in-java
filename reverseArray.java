public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21};
        int len = arr.length;

        for (int i = 0; i < len/2; i++) {
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    
}
