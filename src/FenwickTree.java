public class FenwickTree {
    private int[] bit;
    private int[] nums;
    private int n;

   public FenwickTree(int[] nums) {
        this.n = nums.length;
        bit = new int[n + 1];
        this.nums = new int[n];

        for(int i = 0; i < n; i++) {
            update(i, nums[i]);
        }
   }

    public void update(int index, int val) {
       int delta = val - nums[index];
       nums[index] = val;

       index++;
       while(index <= n) {
           bit[index] += delta;
           index += (index & -index);
       }
   }

   public int getRangeSum(int left, int right) {
       return query(right + 1) - query(left);
   }

   private int query(int idx) {
       int sum = 0;
       while(idx > 0) {
           sum += bit[idx];
           idx -= (idx & -idx);
       }
       return sum;
   }



}
