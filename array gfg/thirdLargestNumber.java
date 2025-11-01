public class thirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 45, 6, 67, 34, 22, 1 ,60};

        // bubble sort
        for (int j = 0; j < arr.length; j++) {

            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(arr[2]);
        // for (int i : arr) {
        //     System.out.println(i);
        // }
    }
}
