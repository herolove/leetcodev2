package org.example.leetcode;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/6/16
 **/
public class WaysToStep {
    public int waysToStep(int n) {
        if(n<3){
            return n;
        }
        int[] a = new int[n];
        a[0] = 1 ;
        a[1] = 2 ;
        a[2] = 4 ;
        for(int i = 3 ;i<n;i++){
            a[i] = (a[i-1]+a[i-2]+a[i-3])%1000000007;
        }
        return a[n-1];
    }

    private int ways(int n) {
        if(n==1){
            return 1;
        }
        int sum = ways(n-1)+ ways(n-2)+ways(n-3);
        return sum;
    }
}
