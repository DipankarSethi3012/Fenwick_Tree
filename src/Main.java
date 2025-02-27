import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        FenwickTree fenwickTree = new FenwickTree(nums);

        for(int i = 0; i < 2; i++) {
            int l = in.nextInt();
            int r = in.nextInt();

            System.out.println(fenwickTree.getRangeSum(l, r));
        }

    }
}