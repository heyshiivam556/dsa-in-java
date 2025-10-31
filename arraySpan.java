import java.util.Scanner;
public class arraySpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int bigger=0;
        int smaller = -1;

        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
            
            if(smaller == -1){
            smaller = arr[i];
            }
            if (arr[i]<smaller) {
                smaller = arr[i];
            }

            if(bigger<arr[i]){
                bigger = arr[i];
            }
            
        }
        int result = bigger - smaller;
        System.out.println(result);
    sc.close();
    }
}
