package in.ruchitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class InsertElementIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int a[] = new int[size+1];
        System.out.println("Enter "+size+" elements:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
            System.out.println("Enter the element to be inserted");
           int ele=scanner.nextInt();
            a[size]=ele;
            System.out.println("After inserting:");
             for(int i=0;i<size;i++)
             {
                 System.out.println(a[i]+" ");
        }
        System.out.println(a[size]);
    }
}
