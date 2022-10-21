package Lv1.JAVA.폰켓몬;

import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> result = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            result.add(nums[i]);
        }
        if(result.size()>nums.length/2){
            return nums.length/2;
        }
        return result.size();
    }
}
