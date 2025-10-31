import java.util.Scanner;
public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter limit");
        n = sc.nextInt();
        
        int sum = 0;
        int n1 = 0,n2 = 1;
      /*  for(int i=1;i<=n;i++){
            if(i==1 || i==2){
                System.out.println(i-1);
            }else{
            sum = n1 + n2 ;
            System.out.println(sum);
            n1 = n2;
            n2 = sum ;
            }
        */
        
        for(int i =1 ; i<=n;i++){
            System.out.println(n1);
            sum = n1 +n2;
            n1 = n2;
            n2 = sum ;
            sc.close();
        }
    }
    
}