public class reverseInGroup {
    public static void reverseIt(int[] arr , int k){
    for (int i = 1; i <= arr.length; i++) {
        if (i%k == 0) {
            int lst = i;
            int fst = i-k;
        
       for (int j = fst; j <= lst; j++) {
        int temp = arr[fst];
        arr[fst] = arr[lst];
        arr[lst] = temp;
       }
    }
    }         
      for (int i : arr) {
        System.out.println(i);
      }      
         
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int k = 4;

        reverseIt(arr , k);
    }
}
