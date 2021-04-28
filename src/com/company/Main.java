package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 3;
	   int[][] image = new int[n][n];
	   for(int i = 0; i<n;i++) {
           for(int j =0; j<n; j++) {
               image[i][j]=(i+j)%2;
           }
       }
        for(int i = 0; i<n;i++) {
            for(int j =0; j<n; j++) {
                System.out.print(image[i][j]+" ");
            }
            System.out.print("\n");
        }
	   Solution s = new Solution();
	   image = s.flipAndInvertImage(image);
	   for(int i = 0; i<n;i++) {
            for(int j =0; j<n; j++) {
                System.out.print(image[i][j]+" ");
            }
            System.out.print("\n");
	   }
    }
}

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int buf;
        for(int i = 0;i < image.length;i++) {
            for(int j = 0, k = image.length-1;j<=k;j++, k--) {
                buf = (image[i][j]+1)%2;
                image[i][j]=(image[i][k]+1)%2;
                image[i][k] = buf;
            }
        }
        return image;
    }
}
