import java.util.Scanner;
public class barChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int level=0;
        System.out.println("enter values");
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
            if (arr[i]>level) {
                level=arr[i];
            }
        }
        for(int i=level ; i>0 ; i--){
            for(int j = 0 ; j<size ; j++){
                if(arr[j]==i){
                    System.out.print(" * ");
                    arr[j]--;
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
