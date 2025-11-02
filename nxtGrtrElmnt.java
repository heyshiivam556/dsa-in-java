public class nxtGrtrElmnt {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,6,12,8,11,3,1,7};
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length-i; j++) {
            if (arr[i]<arr[j]) {
                System.out.println(arr[i]+" < "+arr[j]);
                return;
            }else{
                System.out.println(arr[i]+" < "+"-1");
            }
           }
        }
    }
}
