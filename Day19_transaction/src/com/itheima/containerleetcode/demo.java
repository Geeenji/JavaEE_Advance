package com.itheima.containerleetcode;



public class demo {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int m=maxArea(height);
        System.out.println(m);
    }
    public static int maxArea(int[] height) {
        int thisArea=0,bigArea=0;
        int maxStart=0,maxEnd=0;
        for (int i = 1; i <= height.length-1; i++) {
            for (int j = i+1;j<=height.length;j++){
                thisArea=(j-i)*Math.min(height[j-1],height[i-1]);
                if (thisArea>bigArea){
                    bigArea=thisArea;
                    maxStart=i-1;
                    maxEnd=j-1;
                }
            }
        }
        System.out.println(height[maxStart]+".."+height[maxEnd]);
        return bigArea;
    }
}
