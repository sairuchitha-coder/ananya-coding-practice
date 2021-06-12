package in.ruchitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;

public class ReplaceACharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scanner.nextLine();
        System.out.println("Enter character to be replaced");
        String b = scanner.nextLine();
        System.out.println("Enter character to be replaced with");
        String r = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            s = s.replace(b, r);
        }
        System.out.println(s);
    }
}
