
public class secondLargestNumber {
public static void main(String[] args) {
     int[] arr = {34,12,0,45,36,11,7};
    int first = 0;
    int second = 0;
 for(int i=0;i<arr.length;i++){
    if (arr[i]>first ) {
        second = first;
        first = arr[i];
    }
    else{
        if (arr[i]>second) {
            second = arr[i];
        }
    }
    
 }
 System.out.println(second);
}
}
