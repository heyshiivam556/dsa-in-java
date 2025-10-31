import java.util.Scanner;

public class baseOperations {
    public static int baseAddition(int num1, int num2) {
        int digsum;
        int carry = 0;
        int sum = 0;
        int p = 1;

        while (num1 > 0 || num2 > 0 || carry > 0) {
            int dig1 = num1 % 10;
            num1 /= 10;
            int dig2 = num2 % 10;
            num2 /= 10;
            digsum = dig1 + dig2 + carry;
            carry = digsum / 8;
            digsum = digsum % 8;
            sum = sum + digsum * p;
            p *= 10;
            // num1+=carry; --> when digsum = dig1 +dig2;
        }
        return sum;
    }

    

    public static int baseSubtraction(int num1, int num2) {
        int sub = 0;
        int carry = 0;
        int p=1;
        int digsub=0;
        boolean invert = false;

        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
            invert = true;
        }
        while (num1 > 0 || num2 > 0) {
            int dig1 = num1 % 10;
            dig1 -= carry;
            num1 /= 10;
            int dig2 = num2 % 10;
            num2 /= 10;

            // carry system if dig1 is bigger
            if (dig1 < dig2) {
                dig1 += 8;
                carry = 1;
            } else {
                carry = 0;
            }
            //SUBTRACTION
            digsub = dig1 - dig2;
            sub = sub + digsub*p;
            p*=10;
        }
        // inverting to negative
        if (invert) {
            sub = -sub;
        }
        return sub;
    }
    public static int baseMultiplication(int num1,int num2){
        int sum = 0;
        int q = 1;
        // keep original num1 so we don't consume it while iterating digits of num2
        int origNum1 = num1;

        while (num2 > 0) {
            int dig2 = num2 % 10;
            num2 /= 10;

            // reset per-digit accumulators
            int mult = 0;
            int p = 1;
            int carry = 0;

            int temp = origNum1; // use a copy so origNum1 stays intact for next outer iteration
            while (temp > 0 || carry > 0) {
                int dig1 = temp % 10;
                temp /= 10;
                int prod = dig1 * dig2 + carry;
                int oneMult = prod % 8;
                carry = prod / 8;
                mult += oneMult * p;
                p *= 10;
            }

            sum = baseAddition(sum, mult * q);
            q *= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
    System.out.println("enter num2");
        int num2 = sc.nextInt();
       // System.out.println("result : " + baseAddition(num1, num2));     //print addition
       // System.out.println("result : " + baseSubtraction(num1, num2));       //print subtraction
        System.out.println("result : " + baseMultiplication(num1, num2));       //print mualtiplication
       sc.close();
    }

}