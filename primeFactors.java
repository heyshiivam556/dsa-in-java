import java.util.Scanner;
public class primeFactors {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
       /* int div = 2;
        while(n>1){
            if(n%div==0){
                System.out.print(div+" ");
                n=n/div;
            }
            else{
                div++;
            }
        }
        */
       /* for(int div = 2;div*div<=n;div++){
            while(n%div==0){
                n=n/div;
                System.out.println(div+" ");
            }
        }
        if(n!=1){
            System.out.println(n);
        }
        */
        
       for(int div =2;div*div<=n;div++){
            while(n%div==0){
                n = n/div;
                System.out.print(div+" ");
            }
        }
        if(n!=1){
            System.out.println(n);
        }
        sc.close();
    }
    
}