import java.util.Scanner;
public class benjaminBulbs {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1;i<=n;i++){
            boolean flag = false;
            for(int j=1;j<=n;j++){
                if(i%j==0){
                    flag = !flag;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
            for(int k=1;k*k<=n;k++){
                System.out.print(k*k+" ");
            }
        
    }
    
}