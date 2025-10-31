import java.util.Scanner;
public class allPrimes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low,up;
        System.out.println("input lower limit");
        low = sc.nextInt();
        System.out.println("input upper limit");
        up = sc.nextInt();
        sc.close();
        for(int i= low;i<=up;i++){
            if(i>=2){
                boolean isprime = true;
            for(int j = 2;j*j<=i;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
              }
                if(isprime){
                    System.out.println(i);
                }
            }
        }
        
    }
    
}