package in.ruchitha.leetcode.easy.linkedlist_arrays;

import java.util.Scanner;


    public class RunningSum {

        public static void main(String[] args) {
            RunningSum obj = new RunningSum();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter size of the array");
            int size = scanner.nextInt();

            int[] nums = new int[size];

            System.out.println("Enter " + size + " elements of the array");
            for (int i = 0; i < size; i++) {
                nums[i] = scanner.nextInt();
            }

            int a[] = obj.runningSum(nums);
            System.out.print("[ ");
            for (int i = 0; i < size; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.print("]");

        }
            public int[] runningSum(int[] nums) {
                for (int i = 1; i < nums.length; i++) {
                    nums[i] = nums[i] + nums[i - 1];
                }
                return nums;
            }
        }


