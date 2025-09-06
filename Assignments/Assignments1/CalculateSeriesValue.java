package Assignments.Assignments1;

import java.util.Scanner;

public class CalculateSeriesValue {
    public static void firstSeries()
    {
        boolean plus=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for 1st series: ");
        int n = sc.nextInt();
        int tsum = 1;
        double sum=0.0;
        StringBuilder series= new StringBuilder(" ");
        for(int i=1;i<=n;i++){
//           sum=(plus?sum+(1/tsum):sum-(1/tsum));
            if(plus){
                sum+= (double) 1 /tsum;
                if(tsum!=1){
                    series.append(String.format(" + 1/%d",tsum));
                }else{
                    series.append("1");
                }
            }else{
                sum-= (double) 1 /tsum;
                series.append(String.format(" - 1/%d",tsum));
            }
            tsum+=2;
            plus=!plus;
        }
        System.out.printf("The value of ( %s )  = %.3f\n",series,sum);
    }
    public static void secondSeries()
    {
        boolean plus=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for 2nd series: ");
        int n = sc.nextInt();
        int tsum = 2;
        double sum=0.0;
        StringBuilder series= new StringBuilder(" ");
        for(int i=1;i<=n;i++){
            if(plus){
                sum+= (double) i /tsum;
                if(i!=1){
                    series.append(String.format(" + %d/%d",i,tsum));
                }else{
                    series.append(String.format("%d/%d",i,tsum));
                }
            }else{
                sum-= (double) i /tsum;
                series.append(String.format(" - %d/%d",i,tsum));
            }
            tsum*=2;
            plus=!plus;
        }
        System.out.printf("The value of ( %s )  = %f\n",series,sum);
    }
    public static void main(String[] args) {

        firstSeries();
        secondSeries();

    }
}
/*
Sample Output:
Enter the number of terms for 1st series:
6
The value of (  1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 )  = 0.744
Enter the number of terms for 2nd series:
8
The value of (  1/2 - 2/4 + 3/8 - 4/16 + 5/32 - 6/64 + 7/128 - 8/256 )  = 0.210938

 */