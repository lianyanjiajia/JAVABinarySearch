package com.company;

import java.lang.annotation.ElementType;

public class BinarySearch {

    public static void main(String[] args) {
	// write your code here
        int a[]=new int[10];
        for(int j=0;j<a.length;j++)
        {
            a[j]=j;
        }
        System.out.println(BinarySearch(a,8,0,a.length-1));
    }
    /*二分查找循环实现*/
    static int  BinarySearch(int []a,int key)
    {
        int low=0,high=a.length-1, mid;
        while (low<=high)
        {
            mid=(low+high)/2;
            if(key<a[mid])
                high=mid-1;
            else if(key>a[mid])
                low=mid+1;
            else
                return mid;
        }
        return 0;
    }
    /*二分查找递归实现*/
    static int  BinarySearch(int []a,int key,int low,int high)
    {
        int mid=(low+high)/2;
        if(key<a[mid])
            return  BinarySearch(a,key,low,mid-1);
        else if(key>a[mid])
            return  BinarySearch(a,key,mid+1,high);
        else
            return mid;
    }
}
