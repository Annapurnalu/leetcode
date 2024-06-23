import java.util.Scanner;

public class Remove_duplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] expectedNums1 = {1, 2};
        Remove_duplicates s=new Remove_duplicates();
        int k1 = s.removeDuplicates(nums1);
        assert k1 == expectedNums1.length;
        for (int i = 0; i < k1; i++) {
            assert nums1[i] == expectedNums1[i];
        }
        System.out.println(k1);
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums2 = {0, 1, 2, 3, 4};
        int k2 = s.removeDuplicates(nums2);
        assert k2 == expectedNums2.length;
        for (int i = 0; i < k2; i++) {
            assert nums2[i] == expectedNums2[i];
        }
    }
}
