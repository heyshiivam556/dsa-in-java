public class reverseInGroup {
  public static void reverseIt(int[] arr , int k){
      int length = arr.length;
      for (int i = 0; i < arr.length; i+=k) {
        int fst = i;
        int lst = i+k-1;
        if (lst > length-1){
          lst = length-1;
          
        }
        while (fst<lst) { 
          int temp = arr[fst];
          arr[fst] = arr[lst];
          arr[lst] = temp;
          fst++;
          lst--;
        }
       }
       
      //  for(int i:arr){
      //      System.out.println(i);
      //     }
      for (int i = 0; i < arr.length; i++) {
        if (i%k==0 && i!=0) {
          System.out.print(" | ");
        }
        System.out.print(arr[i] + " ");
      }
    }


  public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int k = 8;

        reverseIt(arr , k);
    }
}
