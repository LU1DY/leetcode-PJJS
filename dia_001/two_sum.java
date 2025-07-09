// Versão da IDE, VSCode e IntelliJ
package dia_001;

import java.util.*;

class Main {
    public static List<Integer> two_sum(List<Integer> nums, int target) {
        Map<Integer, Integer> resultado = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int complemento = target - nums.get(i);
            if (resultado.containsKey(complemento)) {
                return Arrays.asList(resultado.get(complemento), i);
            }
            resultado.put(nums.get(i), i);
        }
        return new ArrayList<>();
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
Map<Integer, Integer> resultado = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (resultado.containsKey(complemento)) {
                return new int[] { resultado.get(complemento), i };
            }
            resultado.put(nums[i], i);
        }
        return new int[] {};
}}
*/