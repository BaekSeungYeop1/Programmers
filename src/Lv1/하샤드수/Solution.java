package Lv1.하샤드수;

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        while (x>0){
            sum += x%10;
            x /= 10;
        }
        if (num % sum == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
