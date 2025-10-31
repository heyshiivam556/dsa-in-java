import java.util.Scanner;
public class DecToBase {
    public static int decToBase(int dec,int base){
        int result=0;
        int count = 0;
        while(dec>0){
           int dig = dec%base;
            dec/=base;
            result += dig*(int)Math.pow(10,count); 
            count++;
        }
        return result;
    }
   public static int BaseToDec(int num,int base){
      int result=0;
      int p = 1;
      while(num>0){
         int dig = num%10;
         num/=10;
         result += dig*p;
         p *=base;
      }
      return result;
   }
   public static int BaseToBase(int num,int b1,int b2){
      int result =0;
      int p = 1;
      while(num>0){
         int dig = num%b2;
         num/=b2;
         result+= dig*p;
         p *= b1;
      }
      return result;
   }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      /*  System.out.println("enter dec");
        int dec = sc.nextInt();
        System.out.println("enter base");
        int base = sc.nextInt();
       */ 
       // int result = decToBase(dec,base);
      //  System.out.println(result);
       
       // que 2
      /* System.out.println("enter num");
        int num = sc.nextInt();
        System.out.println("enter its base");
        int base = sc.nextInt();
      */ 
      // int result = BaseToDec(num,base);
      // System.out.println(result);
       
       //que 3
       System.out.println("enter num");
        int num = sc.nextInt();
       System.out.println("enter its base");
        int b1 = sc.nextInt();
        System.out.println("enter base to change into");
        int b2 = sc.nextInt();
       
       int result = BaseToBase(num,b1,b2);
       System.out.println(result);
       sc.close();
    }
    
}