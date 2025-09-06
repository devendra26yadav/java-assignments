package Assignments.Assignments1;

public class FindSecondMinimum {
    public static void main(String[] args) {
        int[] arr = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
        int min = Integer.MAX_VALUE;
        int smin=min;
        for(int ele:arr){
            if(ele<min ) {
                smin=min;
                min=ele;
            }else if( ele>min && ele<smin){
                smin=ele;
            }
        }
        System.out.println("The second minimum element : "+smin);
    }
}
/*
Sample Output:

The second minimum element : 1

*/