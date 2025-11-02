public class reverseInGroup {
    public static int[] reverseArray(int[] arr,int initial ,int finall){
       
        for (int i = initial; i < finall/2; i++) {
        int temp = arr[initial];
        arr[initial] = arr[finall-initial];
        arr[finall] = temp;
    }
    return arr;
    }
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8};
    int set = 3;
       for(int i=1;i<=arr.length;i++){
        if (i%set==0) {
            reverseArray(arr, i-set+1, i);
        }
       } 
       
    }
}
