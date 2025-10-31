import java.util.Scanner;
public class digitFrequency {
    public static int noOfTimes(int num,int n){
        int count = 0;
        while(num>0){
            int currDigit = num%10;
            num=num/10;
            if(currDigit==n){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 552332237;
        System.out.println("Enter a num");
        int n = sc.nextInt();
        
       int freq = noOfTimes(num,n);
        System.out.println(" freq of "+n+ " is "+freq);
        sc.close();
    }
    
}