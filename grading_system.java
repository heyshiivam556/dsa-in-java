
public class grading_system {
    
    public static void main(String[] args) {
        int marks = 88;
        
        if(marks>90 && marks<=100){
            System.out.println("Excellent");
        }else if(marks>80 && marks<=90){
            System.out.println("Good");
        }else if(marks>70 && marks<=80){
            System.out.println("Fair");
        }else if(marks>60 && marks<=70){
            System.out.println("Meets Expectations");
        }else if(marks>80 && marks<=90){
            System.out.println("Below par");
        }
    }
    
}