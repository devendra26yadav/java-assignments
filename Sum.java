
public class Sum{
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    public static int findSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;

    }
}