package dia_003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findMedian {
    public static double findMedianFunction(List<Integer> nums1, List<Integer> nums2) {
        List<Integer> nums = new ArrayList<>();
        for (int num : nums1) {
            nums.add(num);
        }
        for (int num : nums2) {
            nums.add(num);
        }
        Collections.sort(nums);
        int tamanho = nums.size();

        if (tamanho % 2 == 0) {
            int meio = tamanho / 2;
            return (nums.get(meio) + nums.get(meio - 1)) / 2.0;
        } else {
            return nums.get(tamanho / 2);
        }
    }

    public static void main(String args[]) {
        List<Integer> nums1 = Arrays.asList(1, 2);
        List<Integer> nums2 = Arrays.asList(3, 4);
        System.out.println(findMedian.findMedianFunction(nums1, nums2));
    }
}
