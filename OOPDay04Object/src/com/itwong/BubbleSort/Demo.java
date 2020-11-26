package com.itwong.BubbleSort;

public class Demo {
    public static void main(String[] args) {
        int[] a={2,3,1,4,5,6};
        int[] bubble = Bubble(a);
        for (int i = 0; i < bubble.length; i++) {
            System.out.println(bubble[i]);
        }
        int s = binaryS(bubble,6);
        System.out.println(s);

    }
    public static int[] Bubble(int[] A){
        int flag;
        for (int i = A.length-1; i >=0; i--) {
            flag=0;
            for (int j = 0; j < i; j++) {
                if(A[j]>A[j+1]){
                    int m=A[j];
                    A[j]=A[j+1];
                    A[j+1]=m;
                    flag=1;
                }
            }
            if(flag==0) break;
        }

        return A;
    }
    public static int binaryS(int[] A,int key){
        int start=0,end=A.length-1;
        int mid;
        int flag=-1;
        while(true){
            mid=(start+end)/2;
            if(key>A[mid]){
                start=mid+1;
            }
            if(key<A[mid]) {
                end = mid - 1;
            }
            if (key==A[mid]){
                flag=mid;
                break;
            }
        }
        return flag;

    }
}
