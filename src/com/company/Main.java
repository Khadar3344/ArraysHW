package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in  = new Scanner(System.in);
        // 1
        /*int[] x = {1,4,6,8,9};
        int sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += x[i];

        System.out.printf("the sum is %d\n",sum);*/

        // 2
        /*int[] h = new int[10];
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h.length; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }*/

        // 3
        /*int[] a = {1,2,3,4,5};

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        System.out.printf("the summation is %d\n",sum);
        double avg = sum / 5;

        System.out.println("the average is "+ avg);*/

        //4
        /*int[] f = {4,5,9};
        System.out.println("Input number: ");
        int d = in.nextInt();
        int index;
        for (int r = 0; r < d; r++) {
            index = f[r];

        }
        System.out.println("the index is "+f[d]);*/

        //5
       /* int[] g = {23,54,16,90};
        int max = 0;
        int min = 90;
        for (int f = 0; f < g.length; f++) {
            if(g[f] > max)
                max = g[f];
        }
        for (int c = 0; c < g.length; c++) {
            if(g[c] < min)
                min = g[c];
        }
        System.out.println("the maximum in array is "+ max);
        System.out.println("the minimum in array is "+ min);*/

        // 6
          /* int[] e = {23,54,16,16,16,90};
            int[] w = {55,54,57,16,98,90};
        int duo = 0;

        for (int b = 0; b < e.length; b++) {
            if(e[b] == w[b])
                duo++;
        }
        System.out.println("the common elements between arrays is "+ duo);*/

        // 7
        /*int[] l = {23,54,16,16,16,90};
        int[] p = {55,54,57,16,98,90};

            if(l == p)
        System.out.println("they are same");

            else
        System.out.println("they are different");*/
    }
}
