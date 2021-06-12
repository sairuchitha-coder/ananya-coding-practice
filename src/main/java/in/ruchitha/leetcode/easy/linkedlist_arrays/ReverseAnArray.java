package in.ruchitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        System.out.println("Enter array");
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
            System.out.println(a[i]+" ");
        }
        System.out.println("Reversed array is:");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]+" ");

        }


        }
    }