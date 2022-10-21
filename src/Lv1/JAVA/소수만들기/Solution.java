package Lv1.JAVA.소수만들기;

public class Solution {
    public int solution(int[] nums) {

        int cnt = 0;

        for(int i = 0; i<nums.length-2; i++){
            for(int j= i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++ ){
                    int sum = nums[i]+nums[j]+nums[k];

                    if(!make_prime(sum)){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    public boolean make_prime(int n){
        boolean[] prime = new boolean[n+1];

        prime[0] = prime[1] = true;

        for(int i = 2; i<=Math.sqrt(n); i++){

            if(prime[i]==true){
                continue;
            }

            for(int j = i*i; j<prime.length; j += i){
                prime[j] = true;
            }
        }
        return prime[n];
    }
}
