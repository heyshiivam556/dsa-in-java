import java.util.Scanner;
public class FindInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter values : ");
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a value to find : ");
        int num = sc.nextInt();
        
        for(int i = 0 ; i<size ; i++){
            if (arr[i]==num) {
                System.out.println("index : "+i);
                break;
            }
        }
        sc.close();
    }
}
