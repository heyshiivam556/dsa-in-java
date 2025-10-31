import java.util.Scanner;
public class patterns {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //pattern 1
       /* for(int i = 0;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        } */
        
        //pattern 2
       /* for(int i =n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/
        //pattern 3
     /*   for(int i=0;i<n;i++){
            for(int k=0;k<n-i-1;k++){
                System.out.print("   ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/
        //pattern 4
      /*  for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("   ");
            }
            for(int k = n-i;k>0;k--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        */
        //pattern 5
       /* int m = n / 2;
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("   ");

            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int p = m; p > 0; p--) {
            for (int q = m - p + 1; q > 0; q--) {
                System.out.print("   ");
            }
            for (int r = 2 * p - 1; r > 0; r--) {
                System.out.print(" * ");
            }
            System.out.println();
        } */
     /*   int spc = n/2;
        int star = 1;
        for(int i = 0 ; i <n;i++){
            for(int j=0;j<spc;j++){
                System.out.print("   ");
            }
            for(int k=0;k<star;k++){
                System.out.print(" * ");
            }
            if(i<n/2){
                spc--;
                star+=2;
            }else{
                star-=2;
                spc++;
            }
            System.out.println();
        }*/
        //pattern 6 
       /* int spc = n/2;
        int star = 1;
        for(int i = 0 ; i <n;i++){
            for(int j=0;j<spc+1;j++){
                System.out.print(" * ");
            }
            for(int k=0;k<star;k++){
                System.out.print("   ");
            }
            for(int j=0;j<spc+1;j++){
                System.out.print(" * ");
            }
            if(i<n/2){
                spc--;
                star+=2;
            }else{
                star-=2;
                spc++;
            }
            System.out.println();
        }*/
        //pattern 7
      /*  for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("   ");
            }
            System.out.println(" * ");
            
        }*/
      /*  for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        //pattern 8
       /* for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("   ");
            }
            System.out.println(" * ");
        }*/
     /*    for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        //pattern 9
      /*  int sp1 = 0;
        int sp2 = 4;
           for(int i=0;i<n;i++){
            for(int j=0;j<sp1;j++){
                System.out.print("   ");
            }
               System.out.print(" * ");
              for(int j=0;j<sp2;j++){
                System.out.print("   ");
            } 
               if(i!=n/2){
               System.out.println(" * ");}
               if(i<n/2){
                   sp1++;
                   sp2-=2;
               }else{
                   sp1--;
                   sp2+=2;
               }  
        }*/
       /* for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(i==j || i+j==n-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/
        //pattern 10
      /*  int ptr1 =n/2;
        int ptr2 =n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(j==ptr1 || j==ptr2){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
                if(i<n/2){
                    ptr1--;
                    ptr2++;
                }else{
                    ptr1++;
                    ptr2--;
                }
            
            System.out.println();
        }*/
        //pattern 11
     /*   int count=1;
        for(int i=0;i<n;i++){
            for(int j =0;j<i+1;j++){
               System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }*/
        //pattern 12
       /* int n1 =0;
        int n2=1;
        int sum;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                    System.out.print(n1+" ");
                
                sum = n1+n2;
                n1 = n2;
                n2 = sum;
            }
            System.out.println();
        }*/
          //pattern 13  
       /*  for(int i=0;i<n;i++){
             int icj =1;
            for(int j=0;j<i+1;j++){
               System.out.print(icj+" ");
                int icj1 = icj * (i-j)/(j+1);
                 icj = icj1;   
            }
                 System.out.println();
         }*/
        //pattern 14
      /* for(int i=1;i<=10;i++){
          System.out.println(n+" * "+i+" = "+n*i);
       }*/
       //pattern 15
      /* int ic;
       int str=1;
       int spc=n/2;
       for(int i=0;i<n;i++){
          if(i<n/2){ic = i+1;}
          else{ic =n-i;}
          for(int j=0;j<spc;j++){
             System.out.print("   ");
          }
          for(int j=0;j<str;j++){
             System.out.print(" "+ic+" ");
             if(j<str/2){
                ic++;
             }else{
                ic--;
             }
          }
          if(i<n/2){
             spc--;
             str+=2;
          }else{
             spc++;
             str-=2;
          }
          System.out.println();
       }*/
       //pattern 16
      /* int str1=1;
       int spcf =2*n-3;
       
       for(int i=0;i<n;i++){
          int num=1;
          for(int j=0;j<str1;j++){
             System.out.print(" "+ num +" ");
             num++;
          }
          for(int j=0;j<spcf;j++){
             System.out.print("   ");
          }
          if(i==n-1){
             str1--;
             num--;
          }
          for(int j=0;j<str1;j++){
             num--;
             System.out.print(" "+ num +" ");
          }
          spcf-=2;
          str1++;
          
          System.out.println();
       }*/
       //pattern 17
       /* int str=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                if(i!=(int)n/2){
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            for(int j=0;j<str;j++){
                System.out.print(" * ");
            }
            if(i<n/2){
                str++;
            }else{str--;}
            System.out.println();
        }*/
        //pattern 18
        /*int lspc=0;
        int str = n;
        for(int i=0;i<n;i++){
            for(int j=0;j<lspc;j++){
               System.out.print("   ");
            }
            for(int j=0;j<str;j++){
                if(i>0 && i<n/2 && j>0 && j<str-1){
                   System.out.print("   "); 
                }else{
               System.out.print(" * "); 
                }
            }
            if(i<n/2){
                str-=2;
                lspc++;
            }else{
                str+=2;
                lspc--;
            }  
            System.out.println();
        }*/
     //pattern 19
       for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
             if((i==0 && j<n/2 )|| (i==0 && j==n-1)){
                System.out.print(" * ");
             }
             else if((i<n/2 && j==n/2) || (i<n/2 && j==n-1)){
                System.out.print(" * ");
             }
             else if(i==n/2){
                System.out.print(" * ");
             }
             else if((i>n/2 && j==n/2) || (i>n/2 && j==0)){
                System.out.print(" * ");
             }
             else if((i==n-1 && j>n/2) || (i==n-1 && j==0)){
                System.out.print(" * ");
             }
             else{
                System.out.print("   ");
             }
          }
          System.out.println();
       }  
       //pattern 20
       /* for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<n/2){
                    if(j==0 || j==n-1){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                if(i>=n/2){
                    if((j==0 || j==n-1) || (j==n-i-1 || j==i)){
                        System.out.print(" * ");
                    }
                else{
                    System.out.print("   ");
                }}
            }
            System.out.println();
        }*/
        sc.close();
    }
    
}