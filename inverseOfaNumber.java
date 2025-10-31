import java.util.Scanner;
public class inverseOfaNumber {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter n");
       int n = sc.nextInt();
       
    /*    int count = 0;
        int digit;
        int n2=0;
        while(n!=0){
           digit = n%10;
            n =n/10;
            count++;
            int pos = (int)Math.pow(10,digit-1);
            n2 = n2 + (count*pos);
        }
        System.out.println(n2);
       */
       
       //rotate a number 
       System.out.println("enter k");
       int k =  sc.nextInt();
       int temp = n;
       int count =0;
       while(temp!=0){
          temp=temp/10;
          count++;
       }
       
       k =k%count;
       if(k<0)k = k+count;
       
       int digit;
       for(int i =0;i<k;i++){
          digit = n%10;
         int pos = (int)Math.pow(10,count-1);
          n = n/10 + digit*pos;
          
       }
       System.out.println(n);
       sc.close();
    }
    
}