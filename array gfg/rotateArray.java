public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int d = 2;

        for (int i = 0; i < d; i++) {
            int temp = arr[0];

            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        //Printing
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
