import java.util.Scanner;
public class gcdAndLcm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n,m");
        int n = sc.nextInt(),
        m = sc.nextInt();
       /* int sm;
        if(m>n){
            sm = n;
        } 
        else{
            sm = m;
        }
        while(sm>=2){
            if(m%sm==0 && n%sm==0){
              System.out.println(sm);
                break;  
            }
            sm--;
        }
        System.out.println("LCM "+(m*n)/sm);
        */
        
        int on1 = n,on2=m;
        while(n%m!=0){
            int rem = n%m;
            n = m ;
            m=rem;
        }
        int gcd = m;
        int lcm = (on1*on2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        sc.close();
    }
    
}