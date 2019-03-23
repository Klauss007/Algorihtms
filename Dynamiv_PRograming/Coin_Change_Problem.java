import java.io.*;
import java.util.*;

class min_coin_change_problem{
    public static int fnchange(int n,int[] arr)
    {
        int[] f = new int[n+1];
        f[0] = 0;
        int temp;
        int j;
        for(int i=1;i<=n;i++)
        {
            temp = 9999;
            j=1;
            while(j<arr.length && i >= arr[j])
            {
                temp = min(f[i-arr[j]],temp);
                j++;
            }
            f[i] = temp+1;
        }
        return f[n];
    }
    public static int min(int a,int b)
    {
        return a<b?a:b ;
    }

    public static void main(String args[])
    {
        int[] arr = { 1, 2, 3 };
        int n = 20;
        int x = fnchange(n,arr);
        System.out.println(x); 
    }
}
