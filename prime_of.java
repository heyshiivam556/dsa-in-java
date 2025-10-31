import java.util.Scanner;
public class prime_of {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter t");
        int t = sc.nextInt();
        int n;
        
        for(int i =0;i<t;i++){
            System.out.println("enter n");
            n = sc.nextInt();
            boolean isprime = true;
            if(n==1){
               System.out.println("not prime"); 
            }else{
              for(int j = 2; j*j<=n; j++){
                 if(n%j==0){
                    isprime = false;
                    break;
                 }
              }
              
           if(isprime){
                 System.out.println("prime");
              }else{
                 System.out.println("not prime");
              }
           }
        }
        sc.close();
    }
    
}