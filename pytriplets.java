import java.util.Scanner;
public class pytriplets {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            
        int p = sc.nextInt(),
        b = sc.nextInt(),
        h = sc.nextInt();
            
        boolean istrip = false;
        
        if(p>=b && p>=h){
            if(p*p==b*b+h*h){
                istrip=true;
            }}
            else if(b>=p && b>=h){
                if(b*b==p*p+h*h){
                   istrip=true; 
                }}
            else if(h>=p && h>=b){
                if(h*h==p*p+b*b){
                   istrip=true; 
                }}
        System.out.println(istrip);
        sc.close();
    }
    
}