package Search;

public class LinearSearch {
    public static void main(String[] args) {
        
    }
    public static int find(int[] arr,int target){
        int pos=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                pos=i;
                return pos;
            }
        }
        return pos;
    }
}
