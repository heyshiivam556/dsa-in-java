import java.util.Scanner;
public class countDigits {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("enter max 9 digit");
        int n = sc.nextInt() ;
        sc.close();
      /*  int count =0;
        while(n!=0){
                n = n /10;
                count++;
        }
        System.out.println(count);
    */
        
     /*   int n2 = 0;
        int digit;
        while(n!=0){
            digit = n%10;
            n2 = (n2*10) + digit;
            n = n/10;
        }
        
        while(n2!=0){
            digit = n2%10;
            n2 = n2/10;
            System.out.println(digit);
        }
        */
   /*   
        int temp = n;
        int count = 0;
      while(temp!=0){
        temp = temp /10;
        count++;
      }
      int digit;
      int div = (int)Math.pow(10,(count-1));
      while(div!=0){
        digit = n/div;
        System.out.println(digit);
        n= n%div;
       div = div/10;
      }
  */    
      //reverse a number 
      int digit;
      while(n!=0){
        digit = n%10;
        n = n / 10;
        System.out.println(digit);
      }
        }
    
}