// Versão da IDE, VSCode e IntelliJ
package dia_001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static List<Integer> two_sum(List<Integer> nums, int target) {
        List<Integer> resultado = new ArrayList<Integer>();
        int ignore = -1;
        while (resultado.size() != 2) {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) > target || (ignore != -1 && nums.get(i).equals(nums.get(ignore)))) {
                } else {
                    resultado.add(i);
                    if (resultado.size() == 2 && nums.get(resultado.get(0)) + nums.get(resultado.get(1)) != target) {
                        ignore = resultado.remove(0);
                    }
                }
            }
        }
        return resultado;
    }


    public static void main(String[] args) {
        int target = 9;
        List<Integer> nums = Arrays.asList(2,7,11,15);
        List<Integer> resultado = Main.two_sum(nums, target);
        System.out.println(resultado);
    }
}

// Versão para o LeetCode: 
/*
 class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ignore = -1;
         List<Integer> resultado = new ArrayList<Integer>();
        while (resultado.size() != 2) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > target || (ignore != -1 && nums[i] == nums[ignore])) {
                } else {
                    resultado.add(i);
                    if (resultado.size() == 2 && nums[resultado.get(0)] + nums[resultado.get(1)] != target) {
                        ignore = resultado.remove(0);
                    }
                }
            }
        }
        return new int[] { resultado.get(0), resultado.get(1) };
    }
}
*/