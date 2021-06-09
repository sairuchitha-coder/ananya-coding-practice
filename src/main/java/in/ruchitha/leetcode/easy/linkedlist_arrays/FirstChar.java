package in.ruchitha.leetcode.easy.linkedlist_arrays;
import java.util.Scanner;
public class FirstChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != ' ' && (i == 0 || a[i - 1] == ' ')) {
                System.out.println(a[i]);
            }
        }
    }
}